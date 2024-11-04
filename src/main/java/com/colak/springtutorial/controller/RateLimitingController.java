package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitingController {

    // http://localhost:8080/first
    @GetMapping("/first")
    public String getMessageA() {
        return "first";
    }

    // http://localhost:8080/second
    @GetMapping("/second")
    public String getMessageB() {
        return "second";
    }
}
