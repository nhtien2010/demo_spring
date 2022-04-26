package com.example.demo.services.impls;

import com.example.demo.common.MessageFormatter;
import com.example.demo.common.UserRoleEnum;
import com.example.demo.domains.UserModel;
import com.example.demo.domains.UserRole;
import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.requests.UpdateUserRequestDTO;
import com.example.demo.dtos.responses.UserResponseDTO;
import com.example.demo.exceptions.ConflictRequestException;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.expression.Sets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;

    private PasswordEncoder passwordEncoder;

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private UserModel getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(
                        MessageFormatter.formatUserNotFound(userId)));
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username){
        Optional<UserModel> user = userRepository.findByUsername(username);
        return user.orElse(
                userRepository.findByEmail(username).
                        orElseThrow(() -> new UsernameNotFoundException(
                                MessageFormatter.formatUserNotFound(username))));
    }


    @Override
    public Boolean lockUser(Long userId) {
        UserModel userModel = getUserById(userId);
        userModel.setIsLocked(true);
        userRepository.save(userModel);
        return true;
    }

    @Override
    public Boolean unlockUser(Long userId) {
        UserModel userModel = getUserById(userId);
        userModel.setIsLocked(false);
        userRepository.save(userModel);
        return true;
    }



    @Override
    public UserResponseDTO getUser(Long userId) {
        UserModel userModel = getUserById(userId);
        return mapper.map(userModel, UserResponseDTO.class);
    }
    @Override
    public List<UserResponseDTO> getUsers() {
        List<UserModel> users = userRepository.findAll();
        return users.stream()
                .map(userModel -> mapper.map(userModel, UserResponseDTO.class))
                .collect(Collectors.toList());
    }


    @Override
    public UserResponseDTO createUser(RegisterRequestDTO request) {
        UserModel existedUser = (UserModel) loadUserByUsername(request.getUsername());
        if(existedUser != null){
            throw new ConflictRequestException(MessageFormatter.formatUserAlreadyExist(request.getUsername()));
        }
        UserModel userModel = mapper.map(request, UserModel.class);
        userModel.setIsLocked(false);
        userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
        if(request.userRole.equals(UserRoleEnum.CUSTOMER.name())){
            userModel.setRoles(Collections.singleton(new UserRole(UserRoleEnum.CUSTOMER.name())));
        }else
        if(request.userRole.equals(UserRoleEnum.ADMIN.name())){
            userModel.setRoles(Stream.of(
                    new UserRole(UserRoleEnum.CUSTOMER.name()),
                    new UserRole(UserRoleEnum.ADMIN.name()))
                    .collect(Collectors.toCollection(HashSet::new)));
        }
        userRepository.save(userModel);
        return mapper.map(userModel, UserResponseDTO.class);
    }

    @Override
    public Boolean deleteUser(Long userId) {
        getUserById(userId);
        userRepository.deleteById(userId);
        return true;
    }

    @Override
    public UserResponseDTO updateUser(UpdateUserRequestDTO userRequest) {
        getUserById(userRequest.getId());
        UserModel update = mapper.map(userRequest, UserModel.class);
        userRepository.save(update);
        return mapper.map(update, UserResponseDTO.class);
    }
}
