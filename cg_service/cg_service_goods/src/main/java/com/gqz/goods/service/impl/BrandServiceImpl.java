package com.gqz.goods.service.impl;

import com.gqz.goods.dao.BrandDao;
import com.gqz.goods.pojo.Brand;
import com.gqz.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:16
 **/
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;
    /**
     * 查询所有品牌
     *
     * @return
     */
    @Override
    public List<Brand> findAllBrand() {

        List<Brand> brands = brandDao.selectAll();

        return brands;
    }
}
