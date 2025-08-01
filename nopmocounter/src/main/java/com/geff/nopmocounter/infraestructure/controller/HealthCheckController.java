package com.geff.nopmocounter.infraestructure.controller;
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping("/check")
    public String getHealth() {
        return "OK";
    }
    
    
}
