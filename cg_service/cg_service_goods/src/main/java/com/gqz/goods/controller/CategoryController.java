package com.gqz.goods.controller;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Category;
import com.gqz.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>商品分类控制层</p>
 *
 * @author gqz20
 * @create 2021-11-03 12:16
 **/
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController extends AbstractCoreController<Category> {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CoreService<Category> coreService) {
        super(coreService, Category.class);
        this.categoryService = (CategoryService) coreService;
    }

    /**
     * 根据父ID查询
     */
    @RequestMapping(value = "/list/{pid}")
    public Result<List<Category>> findByPrantId(@PathVariable(value = "pid") Integer pid) {
        //根据父节点ID查询
        List<Category> list = categoryService.findByParentId(pid);
        return new Result<>(true, StatusCode.OK, "查询成功", list);
    }
}
