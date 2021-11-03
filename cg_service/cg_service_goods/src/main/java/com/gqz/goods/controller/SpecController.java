package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Spec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>规格管理的控制类</p>
 *
 * @author gqz20
 * @create 2021-10-31 20:57
 **/
@RestController
@RequestMapping("spec")
@CrossOrigin
public class SpecController extends AbstractCoreController<Spec> {
    @Autowired
    public SpecController(CoreService<Spec> coreService) {
        super(coreService, Spec.class);
    }
}
