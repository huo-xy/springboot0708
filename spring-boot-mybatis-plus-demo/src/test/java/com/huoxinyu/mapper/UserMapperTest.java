package com.huoxinyu.mapper;


import com.huoxinyu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/26 15:38
 */
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}