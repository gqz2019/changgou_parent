package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.goods.pojo.Spu;
import com.gqz.goods.service.SpuService;
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
@RequestMapping("/spu")
@CrossOrigin
public class SpuController extends AbstractCoreController<Spu> {

    private SpuService spuService;

    @Autowired
    public SpuController(SpuService spuService) {
        super(spuService, Spu.class);
        this.spuService = spuService;
    }
}
