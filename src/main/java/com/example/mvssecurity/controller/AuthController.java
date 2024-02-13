package com.example.mvssecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/showLogin")
    public String showLoginPage(){
        return "login-page";
    }
    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }
}
