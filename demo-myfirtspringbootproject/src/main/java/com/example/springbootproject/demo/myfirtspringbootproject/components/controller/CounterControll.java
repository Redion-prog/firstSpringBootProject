package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;

import com.example.springbootproject.demo.myfirtspringbootproject.service.CounterService;
import com.sun.jdi.PrimitiveValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CounterControll {
    private final CounterService counterService;

    @Autowired
    public CounterControll(CounterService counterService){
        this.counterService=counterService;
    }
    @GetMapping("/count")
    public String count(){
        int current =counterService.incrementAndRefresh();
        return "Vlera aktuakle eshte:"+current;
    }
}
