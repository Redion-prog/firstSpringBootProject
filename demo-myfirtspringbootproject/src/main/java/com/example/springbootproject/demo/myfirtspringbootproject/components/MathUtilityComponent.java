package com.example.springbootproject.demo.myfirtspringbootproject.components;



import org.springframework.stereotype.Component;

@Component
public class MathUtilityComponent {

    public int square(int x) {
        return x * x;
    }

    public int cube(int x) {
        return x * x * x;
    }
}

