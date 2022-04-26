package com.example.demo.controllers;

import com.example.demo.dtos.requests.LoginRequestDTO;
import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.services.AuthenticateService;
import com.example.demo.services.UserService;
import com.example.demo.utils.JWTUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/auth")
@RequiredArgsConstructor
public class AuthenticateController {

    final private AuthenticateService authenticateService;
    //final private UserService userService;


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequestDTO request){
        return ResponseEntity.ok(authenticateService.register(request));
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.POST)
    public ResponseEntity<?> refreshToken(@Valid @RequestBody LoginRequestDTO request){
        return ResponseEntity.ok(authenticateService.authenticate(request));
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequestDTO request){
        return ResponseEntity.ok(authenticateService.authenticate(request));
    }

    @RequestMapping(value = "/logout", method = RequestMethod.PUT)
    public ResponseEntity<?> logout(@RequestParam("userId") Long userId){
        return ResponseEntity.ok(authenticateService.logOut(userId));
    }


}
