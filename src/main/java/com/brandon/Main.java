package com.brandon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Annotation required for SpringBootApps, wrapper annotation
@SpringBootApplication
@RestController //
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    // Maps Get Request to Endpoint
    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse(
                "Hello",
                List.of("JavaScript", "GoLang", "Java"),
                new Person("Alex")
        );
    }
    record Person(String name, int age, double savings) {}

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ) {}
}
