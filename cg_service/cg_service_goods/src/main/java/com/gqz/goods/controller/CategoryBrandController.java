package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.goods.pojo.CategoryBrand;
import com.gqz.goods.service.CategoryBrandService;
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
@RequestMapping("/categoryBrand")
@CrossOrigin
public class CategoryBrandController extends AbstractCoreController<CategoryBrand> {

    private CategoryBrandService categoryBrandService;

    @Autowired
    public CategoryBrandController(CategoryBrandService categoryBrandService) {
        super(categoryBrandService, CategoryBrand.class);
        this.categoryBrandService = categoryBrandService;
    }
}
