package com.example.demo.services.impls;

import com.example.demo.domains.UserModel;
import com.example.demo.repositories.AuthenticateRepository;
import com.example.demo.services.AuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateServiceImpl implements AuthenticateService {

/*    @Autowired
    private AuthenticateRepository authenticateRepository;*/

    @Override
    public String authenticate(String username, String password) {
        return null;
    }

    @Override
    public String register(UserModel userModel) {
        return null;
    }
}
