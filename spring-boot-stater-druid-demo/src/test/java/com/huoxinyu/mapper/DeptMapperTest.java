package com.huoxinyu.mapper;


import com.huoxinyu.Pojo.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.logging.Logger;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 17:06
 */
@SpringBootTest
public class DeptMapperTest {

    @Autowired
    private DeptMapper deptMapper;

    private Logger logger = Logger.getLogger(DeptMapperTest.class.getName());

    @Test
    public void test01() {
        List<Dept> deptList = deptMapper.findAll();
        deptList.forEach(dept -> System.out.println(dept));
    }

}