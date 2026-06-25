package com.huoxinyu.controller;

import com.huoxinyu.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 15:16
 */
@RestController
public class UserController {
    @GetMapping("/getUser")
    public User getUser(){
        return new User("XXX",18,"男","北京");
    }
}
