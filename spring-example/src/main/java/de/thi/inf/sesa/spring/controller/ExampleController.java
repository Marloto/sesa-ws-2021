package de.thi.inf.sesa.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class ExampleController {

    @GetMapping("/")
    public String getUsers() {
        return "Hello, World!";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "Hello, World!";
    }

    @PostMapping("/")
    public String addUser(@RequestBody UserRequest user) {
        return "Hello, " + user.getName() + "!";
    }

}
