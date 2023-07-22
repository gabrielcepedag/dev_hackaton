package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class prueba {

    @GetMapping("/hello")
    public String index() {
        return "Hello World ma fucki";
    }
}
