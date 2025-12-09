package com.ranetech.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String helloWorld(String name) {
        return "Hello world, my name is " + name;
    }
}
