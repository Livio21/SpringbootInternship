package dev.al.internship.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hi internship";

    }





}
