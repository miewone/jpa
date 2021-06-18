package com.miewone.jpastudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wgPark on 2021-06-18.
 */

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "hello";
    }
}
