package com.dlq.jdmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dlq.common.utils.PageUtils;
import com.dlq.jdmall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author dlq666
 * @email dlq610@gmail.com
 * @date 2021-07-23 13:53:51
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

