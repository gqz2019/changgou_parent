package com.gqz.goods.service;

import com.github.pagehelper.PageInfo;
import com.gqz.goods.pojo.Brand;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:16
 **/
public interface BrandsService {
    /**
     * 查询所有品牌
     * @return
     */
    List<Brand> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Brand findById(Integer id);
    /**
     * 新增品牌
     * @param brand
     */
    void add(Brand brand);
    /***
     * 修改品牌数据
     * @param brand
     */
    void update(Brand brand);
    /***
     * 删除品牌
     * @param id
     */
    void delete(Integer id);
    /***
     * 多条件搜索品牌方法
     * @param brand
     * @return
     */
    List<Brand> findList(Brand brand);
    /**
     * 多条件分页查询
     * @param brand
     * @param page
     * @param size
     * @return
     */
    PageInfo<Brand> findPage(Brand brand, int page, int size) throws Exception;

    /**
     * 根据分类ID查询品牌集合
     * @param categoryid:分类ID
     * @return list<brand>
     */
    List<Brand> findByCategory(Integer categoryid);
}
