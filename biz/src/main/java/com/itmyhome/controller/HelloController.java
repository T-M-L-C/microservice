package com.itmyhome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lqa on 2017/6/3.
 */
@RestController
public class HelloController {

    @RequestMapping
    public String hello(){
        return "hello world!";
    }
}
