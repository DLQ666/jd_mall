package com.dlq.jdmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

/**
 * @program: learn_parent
 * @description: 网关跨域配置类
 * @author: Hasee
 * @create: 2020-07-07 20:48
 */
@Configuration
public class JdmallCorsConfig {

    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); //是否允许携带cookie
        config.addAllowedOrigin("*"); //可接受的域，是一个具体域名或者*（代表任意域名）
        config.addAllowedHeader("*"); //允许携带的头
        config.addAllowedMethod("*"); //允许访问的方式

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }
}
