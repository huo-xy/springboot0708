package com.huoxinyu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/25 16:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;
}
