package com.dlq.jdmall.coupon.dao;

import com.dlq.jdmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-23 12:48:08
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
