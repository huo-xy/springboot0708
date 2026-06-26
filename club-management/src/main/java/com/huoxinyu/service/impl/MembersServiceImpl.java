package com.huoxinyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huoxinyu.pojo.Members;
import com.huoxinyu.service.MembersService;
import com.huoxinyu.mapper.MembersMapper;
import org.springframework.stereotype.Service;

/**
* @author 霍鑫宇
* @description 针对表【members(社团成员关系表)】的数据库操作Service实现
* @createDate 2026-06-26 21:45:25
*/
@Service
public class MembersServiceImpl extends ServiceImpl<MembersMapper, Members>
    implements MembersService{

}




