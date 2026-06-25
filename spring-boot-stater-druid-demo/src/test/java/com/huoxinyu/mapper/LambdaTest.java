package com.huoxinyu.mapper;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 17:11
 */
public class LambdaTest {

    @Test
    public void test1(){
        Predicate p = o -> false;
    }

    @Test
    public void test2(){
        Consumer c =o -> System.out.println(o);
    }

    @Test
    public void test3(){
        Supplier s = () -> new Object();
    }
}
