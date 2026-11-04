package com.thinkworks.pizza.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.thinkworks.pizza")
public class WebConfig {
    public WebConfig(){
        System.out.println("Running WebConfig");
    }
}
