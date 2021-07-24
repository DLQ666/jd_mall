package com.dlq.jdmall.member.feign;

import com.dlq.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@description:
 *@author: Hasee
 *@create: 2021-07-24 12:58
 */
@FeignClient("jd-coupon")
public interface CouponFeignClient {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
