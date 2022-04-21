package com.example.demo.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDTO {
    private String token;
    private String refreshToken;
    private UserResponseDTO user;
}
