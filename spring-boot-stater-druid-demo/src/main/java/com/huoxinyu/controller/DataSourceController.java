package com.huoxinyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 16:34
 */
@RestController
public class DataSourceController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("datasource")
    public Map<String, Object> getDataSource(){

        Map<String, Object> map = new HashMap<>();
        map.put("DataSourceType", dataSource.getClass().getName());

        return map;
    }
}
