package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Para;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>商品参数</p>
 *
 * @author gqz20
 * @create 2021-10-31 21:03
 **/
@RestController
@RequestMapping("para")
@CrossOrigin
public class ParaController extends AbstractCoreController<Para> {
    @Autowired
    public ParaController(CoreService<Para> coreService) {
        super(coreService, Para.class);
    }
}

