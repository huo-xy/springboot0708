package com.huoxinyu.goodsorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huoxinyu.goodsorder.entity.Goods;
import com.huoxinyu.goodsorder.mapper.GoodsMapper;
import com.huoxinyu.goodsorder.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * 商品 Service 实现类
 *
 * ServiceImpl<GoodsMapper, Goods> 帮你把 BaseMapper 和 IService 连接起来
 * 你不需要写任何实现代码，就已经拥有了完整的 CRUD 能力
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
}