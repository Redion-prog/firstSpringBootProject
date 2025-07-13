package com.example.springbootproject.demo.myfirtspringbootproject.service;

import org.springframework.stereotype.Service;

//trego qe  kjo klase  ka  nje  sherbim llogjik dhe ka nje  business logic te aplikacionit

@Service
public class GreetingService {

    public  String greet(){
        return "Hello from Greeting Service";

    }
}
