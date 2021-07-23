package com.dlq.jdmall.order.dao;

import com.dlq.jdmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-23 13:53:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
