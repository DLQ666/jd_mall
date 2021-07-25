package com.dlq.jdmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dlq.common.utils.PageUtils;
import com.dlq.jdmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-22 21:33:51
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询三级分类菜单
     * @return
     */
    List<CategoryEntity> listWithTree();

}

