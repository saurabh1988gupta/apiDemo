package com.devops.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome1")
    public String welcome1(){
        return "This is my first Spring Boot API application method1...";
    }

    @GetMapping("/welcome2")
    public String welcome2(){
        return "This is my first Spring Boot API application method2...";
    }

    @GetMapping("/welcome3")
    public String welcome3(){
        return "This is my first Spring Boot API application method3...";
    }

    @GetMapping("/welcome4")
    public String welcome4(){
        return "This is my first Spring Boot API application method4...";
    }
}