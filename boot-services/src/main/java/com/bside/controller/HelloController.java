package com.bside.controller;

import com.bside.message.ResponseMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseMessage greet() {
        return new ResponseMessage("Hello BSide Gangnam!");
    }

}