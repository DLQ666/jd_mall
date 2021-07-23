package com.dlq.jdmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dlq.common.utils.PageUtils;
import com.dlq.jdmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-23 13:53:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

