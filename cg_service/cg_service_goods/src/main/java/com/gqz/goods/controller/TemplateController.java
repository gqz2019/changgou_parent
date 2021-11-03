package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 20:43
 **/
@RestController
@RequestMapping("template")
@CrossOrigin
public class TemplateController extends AbstractCoreController<Template> {
    @Autowired
    public TemplateController(CoreService<Template> coreService) {
        super(coreService, Template.class);
    }
}
