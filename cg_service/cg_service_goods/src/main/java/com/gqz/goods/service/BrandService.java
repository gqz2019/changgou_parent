package com.gqz.goods.service;

import com.gqz.goods.pojo.Brand;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:16
 **/
public interface BrandService {
    /**
     * 查询所有品牌
     * @return
     */
    List<Brand> findAllBrand();


}
