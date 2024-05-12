package com.star.agile.assignment.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Mycontroller {
    @GetMapping("/test-docker")
    public String getData() {
    	return "Kubernetes";
    }
    
}
