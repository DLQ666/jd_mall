package com.dlq.jdmall.ware.dao;

import com.dlq.jdmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-23 14:01:03
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
