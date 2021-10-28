package com.gqz.goods;

import com.gqz.goods.pojo.Brand;
import com.gqz.goods.service.BrandsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:06
 **/
@SpringBootTest

public class test {
    @Autowired
    @Qualifier("brandsServiceImpl")
    private BrandsService brandService;
    @Test
    public void a(){
        List<Brand> allBrand = brandService.findAll();

        allBrand.forEach(brand -> {
            System.out.println(brand.toString());
        });
    }

}
