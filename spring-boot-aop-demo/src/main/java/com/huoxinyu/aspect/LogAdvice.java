package com.huoxinyu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/26 15:02
 */
@Component
@Aspect
@Order(3)
public class LogAdvice {
    @Before("execution(* com.huoxinyu.controller.*.*(..))")
    public void before(JoinPoint point){
        //获取类信息
        String className = point.getTarget().getClass().getSimpleName();
        //获取方法信息
        String methodName = point.getSignature().getName();
        System.out.println(className + "." + methodName + "执行前");
    }
}
