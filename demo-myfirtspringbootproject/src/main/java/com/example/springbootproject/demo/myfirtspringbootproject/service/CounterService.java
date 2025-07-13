package com.example.springbootproject.demo.myfirtspringbootproject.service;


import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int counter =0;
    public  int incrementAndRefresh(){
        counter++;
        return counter;
    }
}
