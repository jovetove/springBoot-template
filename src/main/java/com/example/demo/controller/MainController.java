package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jove
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
