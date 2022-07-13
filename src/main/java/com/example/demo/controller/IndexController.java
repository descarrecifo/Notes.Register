package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping
    public String sayHello() {
        String hello = "hol que tal?"+"\n"+"prova";
        //return hello;
        return "Hello and Welcome to the Notes application. <br> <br>   GET api/notes <br>  GET api/notes/{id} <br> POST api/notes <br> PUT api/notes/{id} <br> DELETE api//notes/{id}";
    }
}