package com.example.demo_gradle.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {
    HelloWorldController hwc = new HelloWorldController();

    @Test
    @DisplayName("########some name########")
    void helloWorldTest() {
        String returnString = "Hello, World!";
        String actual = hwc.helloWorld();
        assertEquals(returnString, actual);
    }

    @Test
    void customMessage() {
        String expectedMessage = "my custom message";
        String actualMessage = hwc.customMessage("my custom message");
        assertEquals(expectedMessage, actualMessage);
    }
}