package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World !";

    }
}

