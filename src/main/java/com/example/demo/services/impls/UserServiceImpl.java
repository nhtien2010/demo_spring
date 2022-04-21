package com.example.demo.services.impls;

import com.example.demo.domains.UserModel;
import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.requests.UpdateUserRequestDTO;
import com.example.demo.dtos.responses.UserResponseDTO;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;




    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserModel> user = userRepository.findByUsername(username);
        return user.orElse(
                userRepository.findByEmail(username).
                        orElseThrow(() -> new UsernameNotFoundException(format("user - %s, not exist", username)))
        );

//        if(user.isPresent()){
//            return user.get();
//        }
//        user = userRepository.findByEmail(username);
//        if(user.isPresent()){
//            return user.get();
//        }
    }

    @Override
    public Boolean lockUser(Long userId) {
        return null;
    }

    @Override
    public Boolean unlockUser(Long userId) {
        return null;
    }

    @Override
    public UserResponseDTO getUser(Long userId) {
        return null;
    }

    @Override
    public UserResponseDTO getUser(String username, String authSrc) {
        return null;
    }

    @Override
    public List<UserResponseDTO> getUsers() {
        return null;
    }

    @Override
    public UserResponseDTO createUser(RegisterRequestDTO request) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long userId) {
        return null;
    }

    @Override
    public UserResponseDTO updateUser(UpdateUserRequestDTO userRequest) {
        return null;
    }
}
