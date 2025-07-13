package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;


import com.example.springbootproject.demo.myfirtspringbootproject.components.MathUtilityComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathUtilityComponent mathUtilityComponent;

    @Autowired
    public MathController(MathUtilityComponent mathUtilityComponent){
        this.mathUtilityComponent=mathUtilityComponent;
    }
    @GetMapping("/square/{x}")
    public  String square(@PathVariable int x ){

        int result= mathUtilityComponent.square(x);
        return "Katrori i "+x+"eshte "+ result;
    }


}
