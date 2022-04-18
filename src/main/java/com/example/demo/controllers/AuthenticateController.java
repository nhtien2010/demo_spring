package com.example.demo.controllers;

import com.example.demo.services.AuthenticateService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthenticateController {

   /* @Autowired
    private AuthenticateService authenticateService;
    @Autowired
    private UserService userService;*/

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(HttpServletRequest request,
                           @ModelAttribute("email") String email,
                           @ModelAttribute("username") String username,
                           Model model){


    }

    public void login(){

    }

    public void logout(){

    }
}
