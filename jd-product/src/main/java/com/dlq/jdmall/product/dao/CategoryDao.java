package com.dlq.jdmall.product.dao;

import com.dlq.jdmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-22 21:33:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
