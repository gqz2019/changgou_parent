package com.gqz.goods.config;

import com.gqz.common.entity.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ID配置</p>
 *
 * @author gqz20
 * @create 2021-11-06 09:05
 **/
@Configuration
public class IdWorkConfig {
    @Bean
    public IdWorker generateIdWorker() {
        return new IdWorker(0,0);
    }
}
