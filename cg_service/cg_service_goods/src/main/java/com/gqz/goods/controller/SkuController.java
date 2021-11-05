package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.goods.pojo.Sku;
import com.gqz.goods.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/sku")
@CrossOrigin
public class SkuController extends AbstractCoreController<Sku> {

    private SkuService skuService;

    @Autowired
    public SkuController(SkuService skuService) {
        super(skuService, Sku.class);
        this.skuService = skuService;
    }
}
