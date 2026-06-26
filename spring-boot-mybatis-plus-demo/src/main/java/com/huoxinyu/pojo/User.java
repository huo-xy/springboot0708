package com.huoxinyu.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 霍鑫宇
 * @Classname
 * @Description TODO
 * @Date 2026/6/26 15:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("`t_user`")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
