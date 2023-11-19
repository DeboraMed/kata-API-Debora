package com.example.kataapideboranew;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/bye")
    public String byeWorld(){
        return "Bye World";
    }
}
