package com.github.bysrhq.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class ToDoAppApplication {
    
    /*
        Bootstrap Spring Boot application
        @
    */
    public static void main(String[] args) {
        SpringApplication.run(ToDoAppApplication.class, args);
    }
}
