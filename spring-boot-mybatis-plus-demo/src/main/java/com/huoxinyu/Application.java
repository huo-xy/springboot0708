package com.huoxinyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/26 15:32
 */
@SpringBootApplication
@MapperScan("com.huoxinyu.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
