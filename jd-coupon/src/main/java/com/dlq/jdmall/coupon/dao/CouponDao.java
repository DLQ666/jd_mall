package com.dlq.jdmall.coupon.dao;

import com.dlq.jdmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-23 12:48:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
