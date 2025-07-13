package com.example.springbootproject.demo.myfirtspringbootproject.components;




import org.springframework.stereotype.Component;

@Component
public class TextUtilsComponent {

    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

