package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;




import com.example.springbootproject.demo.myfirtspringbootproject.components.TextUtilsComponent;
import org.springframework.web.bind.annotation.*;

@RestController
public class TextController {

    private final TextUtilsComponent textUtils;

    public TextController(TextUtilsComponent textUtils) {
        this.textUtils = textUtils;
    }

    @GetMapping("/reverse/{text}")
    public String reverseText(@PathVariable String text) {
        return textUtils.reverse(text);
    }
}

