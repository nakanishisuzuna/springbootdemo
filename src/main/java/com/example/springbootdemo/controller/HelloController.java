package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.dto.Sample;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public Sample hello(){
        Sample sample = new Sample();
        sample.setId(100);
        sample.setName("taro");

        return  sample;
    }
}