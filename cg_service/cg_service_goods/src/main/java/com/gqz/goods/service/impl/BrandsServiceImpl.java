package com.gqz.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gqz.goods.dao.BrandDao;
import com.gqz.goods.pojo.Brand;
import com.gqz.goods.service.BrandsService;
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
public class BrandsServiceImpl implements BrandsService {
    @Autowired
    private BrandDao brandDao;

    /**
     * 查询所有品牌
     *
     * @return
     */
    @Override
    public List<Brand> findAll() {

        List<Brand> brands = brandDao.selectAll();

        return brands;
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public Brand findById(Integer id) {
        return brandDao.selectByPrimaryKey(id);
    }

    /***
     * 修改品牌数据
     * @param brand
     */
    @Override
    public void update(Brand brand) {
        brandDao.updateByPrimaryKeySelective(brand);
    }

    /***
     * 删除品牌
     * @param id
     */
    @Override
    public void delete(Integer id) {
        brandDao.deleteByPrimaryKey(id);
    }

    /**
     * 新增品牌
     *
     * @param brand
     */
    @Override
    public void add(Brand brand) {
        brandDao.insertSelective(brand);
    }

    /**
     * 多条件分页查询
     *
     * @param brand
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Brand> findPage(Brand brand, int page, int size) throws Exception {
        PageHelper.startPage(page, size);
        PageInfo<Brand> brandPageInfo = new PageInfo<>();
        List<Brand> brands = brandDao.findByMulti(brand);
        brandPageInfo.setList(brands);

        return brandPageInfo;

    }

    /**
     * 根据分类ID查询品牌集合
     *
     * @param categoryid :分类ID
     * @return list<brand>
     */
    @Override
    public List<Brand> findByCategory(Integer categoryid) {
        List<Brand> brands = brandDao.findByCategory(categoryid);

        return brands;
    }

    /**
     * 多条件搜索品牌方法
     * @param brand
     * @return
     */
    @Override
    public List<Brand> findList(Brand brand) {
        List<Brand> brands = brandDao.findByMulti(brand);
        return brands;
    }
}
