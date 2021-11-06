package com.gqz.goods.controller;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Template;
import com.gqz.goods.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private TemplateService templateService;

    @Autowired
    public TemplateController(CoreService<Template> coreService) {
        super(coreService, Template.class);
        this.templateService= (TemplateService) coreService;
    }

    /***
     * 根据分类查询模板数据
     * @param id:分类ID
     */
    @GetMapping(value = "/category/{id}")
    public Result<Template> findByCategoryId(@PathVariable(value = "id")Integer id){
        //调用Service查询
        Template template = templateService.findByCategoryId(id);
        return new Result<>(true, StatusCode.OK, "查询成功", template);
    }
}
