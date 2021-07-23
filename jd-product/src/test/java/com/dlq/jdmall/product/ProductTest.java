package com.dlq.jdmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dlq.jdmall.product.entity.BrandEntity;
import com.dlq.jdmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 *@program: jdmall
 *@description:
 *@author: Hasee
 *@create: 2021-07-23 00:09
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(111L);
//        brandEntity.setName("hahahahha");
//        brandService.save(brandEntity);
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 20L));
        brand_id.forEach((item)->{
            System.out.println(item);
        });
    }
}
