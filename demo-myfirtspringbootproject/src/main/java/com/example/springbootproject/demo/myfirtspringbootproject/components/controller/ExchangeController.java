package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class ExchangeController {


    private static final double EXCHANGE_RATE=1.1;



    @GetMapping("/eur-to-usd/{amount}")
    public String convertEurToUsd(@PathVariable double amount) {

        double result=amount*EXCHANGE_RATE;
        return amount + "EUR="+String.format("%.2f",result)+"USD";

    }
}

