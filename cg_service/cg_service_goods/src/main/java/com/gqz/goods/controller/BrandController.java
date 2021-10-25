package com.gqz.goods.controller;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.goods.pojo.Brand;
import com.gqz.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:21
 **/
@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    /***
     * 查询全部数据
     * @return
     */
    @GetMapping
    public Result<Brand> findAll() {
        List<Brand> brandList = brandService.findAllBrand();
        return new Result<Brand>(true, StatusCode.OK, "查询成功", brandList);
    }
}