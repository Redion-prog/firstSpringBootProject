package com.example.springbootproject.demo.myfirtspringbootproject.service;




import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    public String sayHello(String lang) {
        return switch (lang.toLowerCase()) {
            case "en" -> "Hello";
            case "fr" -> "Bonjour";
            case "de" -> "Hallo";
            case "es" -> "Hola";
            case "it" -> "Ciao";
            default -> "Hello (default)";
        };
    }
}

