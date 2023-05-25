package com.brandon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation required for SpringBootApps
@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    // Maps Get Request to Endpoint
    @GetMapping("/greet")
    public String greet() {
        return "Hello";
    }
}
