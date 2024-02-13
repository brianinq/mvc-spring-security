package com.example.mvssecurity.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController implements ErrorController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/leaders")
    public String leaders(){
        return "leaders";
    }
    @RequestMapping("/error")
    public String notFound(){
        return "not-found";
    }
}
