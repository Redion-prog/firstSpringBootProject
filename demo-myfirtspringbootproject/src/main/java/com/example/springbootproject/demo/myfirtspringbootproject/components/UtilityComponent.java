package com.example.springbootproject.demo.myfirtspringbootproject.components;



import org.springframework.stereotype.Component;

@Component
public class UtilityComponent {

    public String toUpper(String text) {

        return text.toUpperCase();
    }
}

