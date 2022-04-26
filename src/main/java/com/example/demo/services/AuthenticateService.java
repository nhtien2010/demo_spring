package com.example.demo.services;

import com.example.demo.dtos.requests.LoginRequestDTO;
import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.responses.LoginResponseDTO;
import com.example.demo.dtos.responses.UserResponseDTO;

public interface AuthenticateService {
    LoginResponseDTO authenticate(LoginRequestDTO requestDTO);
    Boolean register(RegisterRequestDTO request);
    Boolean logOut(Long userId);

}
