package com.ranetech.demo.controller;

import com.ranetech.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ranetech.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/hello")
public class HelloController {
    // existe 2 maneiras de injetar o HelloService no HelloController

    // 1 - criar um construtor para o HelloController que recebe o HelloService como parametro
    /*private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }*/

    //2 - usar a anotacao @Autowired para injetar o HelloService no HelloController
    @Autowired
    private HelloService helloService;
    
    @GetMapping
    public String hello() {
        return helloService.helloMessage("Roberto");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello " + body.getName() + " Your email is " + body.getEmail();
    }
}
