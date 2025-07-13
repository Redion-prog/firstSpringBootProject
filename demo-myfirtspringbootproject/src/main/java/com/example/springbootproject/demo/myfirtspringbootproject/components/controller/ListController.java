package com.example.springbootproject.demo.myfirtspringbootproject.components.controller;




import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ListController {

    @GetMapping("/names")
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        return List.of("Tom","Anna","John");

    }
}

