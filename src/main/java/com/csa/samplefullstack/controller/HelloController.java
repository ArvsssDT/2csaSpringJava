package com.csa.samplefullstack.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")   // allows different (all if "*" is used) requests
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Click the button below to send some love to Cherry Bullet💕";
    }
}