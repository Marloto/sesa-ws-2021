package de.thi.inf.sesa.mqtt.controller;

import de.thi.inf.sesa.mqtt.services.ExampleMqttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ExampleController {

    @Autowired
    private ExampleMqttService service;

    @GetMapping
    public void doSomething() {
        service.publish("Hello, World!");
    }
}
