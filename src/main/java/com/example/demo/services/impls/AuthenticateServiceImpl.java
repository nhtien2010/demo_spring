package com.example.demo.services.impls;

import com.example.demo.domains.UserModel;
import com.example.demo.dtos.requests.LoginRequestDTO;
import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.responses.UserResponseDTO;
import com.example.demo.repositories.AuthenticateRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.AuthenticateService;
import com.example.demo.services.UserService;
import com.example.demo.utils.JWTUtil;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticateServiceImpl implements AuthenticateService {

    final private AuthenticateRepository authenticateRepository;
    final private UserRepository userRepository;
    private final ModelMapper mapper;

    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTUtil jwtUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserResponseDTO authenticate(LoginRequestDTO request) {
        return null;
    }

    @Override
    public Boolean register(RegisterRequestDTO dto) {
//        UserModel userModel = mapper.map(dto, UserModel.class);
//        userService.createUser(dto);
        return true;
    }

    @Override
    public Boolean logOut(Long userId) {
        return null;
    }
}
