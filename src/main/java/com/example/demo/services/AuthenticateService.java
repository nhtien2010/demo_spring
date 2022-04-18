package com.example.demo.services;

import com.example.demo.domains.UserModel;

public interface AuthenticateService {
    public  String authenticate(String username, String password);
    public  String register(UserModel userModel);

}
