package com.huoxinyu.controller;

import com.huoxinyu.Pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 16:46
 */
@RestController
public class DeptController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("deptList")
    public List<Dept> findAll(){
        String sql = "select * from dept";
        List<Dept> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Dept.class));

        return list;
    }
}
