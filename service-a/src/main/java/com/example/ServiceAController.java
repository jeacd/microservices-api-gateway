package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    @GetMapping("/hello")
    public String helloServiceA() {
        return "Olá do Service A!";
    }
}