package com.example.demo_gradle.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/hello")
@CrossOrigin(origins = "*")
public class HelloWorldController {

    @GetMapping(path = "/world")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping(path="/{message}")
    public String customMessage(@PathVariable String message) {
        return message;
    }
}
