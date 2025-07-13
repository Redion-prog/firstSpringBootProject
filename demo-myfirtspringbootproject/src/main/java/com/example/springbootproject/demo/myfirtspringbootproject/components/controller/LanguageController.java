package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;

import com.example.springbootproject.demo.myfirtspringbootproject.service.LanguageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/{lang}")
    public String greet(@PathVariable String lang) {
        return languageService.sayHello(lang);
    }
}
