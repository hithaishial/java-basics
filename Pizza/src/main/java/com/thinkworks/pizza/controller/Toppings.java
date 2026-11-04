package com.thinkworks.pizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class Toppings {

    public Toppings(){
        System.out.println("running toppings");
    }
    @RequestMapping("/user")
    public String userDetails(@RequestParam String name, @RequestParam String age)
    {
       System.out.println("Name: " + name + "\nAge: " + age);
        return "index.jsp";
    }
}
