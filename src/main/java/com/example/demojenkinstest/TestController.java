package com.example.demojenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/first")
    public String getFirst(){
        return "first test";
    }

    @GetMapping("/second")
    public String getSecond(){
        return "second test";
    }
}
