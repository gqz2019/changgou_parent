package com.gqz.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 09:12
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gqz.goods")
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
