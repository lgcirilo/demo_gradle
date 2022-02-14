package com.example.demo_gradle.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
@CrossOrigin(origins = "*")
public class HelloWorldController {

    @GetMapping(path = "/world")
    public String helloWorld() {
        return "Hello, World!";
    }
}
