package com.pandaq.dubbo.consumer.web.controller;

import com.pandaq.dubbo.api.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luz.Ho211
 * @date 2019-12-13 23:45
 */
@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(path = "/greeting")
    public String greeting(@RequestParam String name) {
        return greetingService.sayHello(name);
    }

}
