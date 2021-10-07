package de.thi.inf.sesa.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class ExampleController {

    @GetMapping("/hello")
    public String getUsers() {
        return "Hello, World!";
    }

}
