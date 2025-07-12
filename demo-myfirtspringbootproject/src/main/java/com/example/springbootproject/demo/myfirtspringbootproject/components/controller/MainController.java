package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;

import com.example.springbootproject.demo.myfirtspringbootproject.components.MessageComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {

    @Autowired
    private MessageComponent messageComponent;

    @GetMapping ("/mesazh")
    public String shfaqMesazhin(){
        return messageComponent.getMessage();

    }
}
