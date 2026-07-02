package com.huoxinyu.goodsorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huoxinyu.goodsorder.entity.Order;
import com.huoxinyu.goodsorder.mapper.OrderMapper;
import com.huoxinyu.goodsorder.service.OrderService;
import org.springframework.stereotype.Service;

/** 订单 Service 实现类 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}