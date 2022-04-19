package com.example.demo.controllers;

import com.example.demo.dtos.requests.RegisterRequest;
import com.example.demo.services.AuthenticateService;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "api/authenticate")
@RequiredArgsConstructor
public class AuthenticateController {

    final private AuthenticateService authenticateService;
    final private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody RegisterRequest request){

     return null;


    }

    @RequestMapping(value = "/refreshToken", method = RequestMethod.POST)
    public void refreshToken(){

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(){
        return null;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public void logout(){

    }


}
