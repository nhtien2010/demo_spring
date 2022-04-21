package com.example.demo.services;

import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.requests.UpdateUserRequestDTO;
import com.example.demo.dtos.responses.UserResponseDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService{

    Boolean lockUser(Long userId);
    Boolean unlockUser(Long userId);
    UserResponseDTO getUser(Long userId);
    UserResponseDTO getUser(String username, String authSrc);
    List<UserResponseDTO> getUsers();
    UserResponseDTO createUser(RegisterRequestDTO registerRequestDTO);
    Boolean deleteUser(Long userId);
    UserResponseDTO updateUser(UpdateUserRequestDTO userRequest);

}
