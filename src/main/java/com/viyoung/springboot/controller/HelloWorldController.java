package com.viyoung.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vi-young
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }
}
