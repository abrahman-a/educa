package com.hello.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("api/v1")
@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "Hello wiseboy welcome again in window";
    }
}
