package com.example.demo.dtos.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    public String email;
    public String username;
    public String password;
    public int userRoleId;
}
