package com.aunanant.Spring.Experimental.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }
}
