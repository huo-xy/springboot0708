package com.huoxinyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 14:47
 */
@RestController
//@RequestMapping("/")
public class HelloController {
    @GetMapping( "/hello")
    public String hello(){
        return "hello Spring Boot";
    }
}
