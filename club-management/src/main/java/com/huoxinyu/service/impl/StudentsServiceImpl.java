package com.huoxinyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huoxinyu.pojo.Students;
import com.huoxinyu.service.StudentsService;
import com.huoxinyu.mapper.StudentsMapper;
import org.springframework.stereotype.Service;

/**
* @author 霍鑫宇
* @description 针对表【students(学生基本信息表)】的数据库操作Service实现
* @createDate 2026-06-26 21:45:25
*/
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper, Students>
    implements StudentsService{

}




