package com.gqz.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 09:12
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gqz.goods.dao")
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
