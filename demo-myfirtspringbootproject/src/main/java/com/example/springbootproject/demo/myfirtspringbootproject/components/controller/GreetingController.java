package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;

import com.example.springbootproject.demo.myfirtspringbootproject.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private  final GreetingService greetingService;

    //injektimi i greeting service  nepermjet  constructorit
    @Autowired
     public GreetingController(GreetingService greetingService){
        this.greetingService=greetingService;


    }
    @GetMapping("/greeting")
    public String getGreeting(){
        return greetingService.greet();
    }
}
