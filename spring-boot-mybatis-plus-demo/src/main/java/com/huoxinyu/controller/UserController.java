package com.huoxinyu.controller;

import com.huoxinyu.mapper.UserMapper;
import com.huoxinyu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/26 15:49
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("user")
    public String getUser(ModelMap modelMap){
        List<User> list = userMapper.selectList(null);
        modelMap.addAttribute("userList",list);
        return "show";
    }
}
