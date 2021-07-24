package com.dlq.jdmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *@program: jdmall
 *@description:
 *@author: Hasee
 *@create: 2021-07-23 13:42
 */
@EnableFeignClients(basePackages = "com.dlq.jdmall.member.feign")
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
