package com.gqz.goods.dao;

import com.gqz.goods.pojo.Brand;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:04
 **/
@Repository
public interface BrandDao extends Mapper<Brand> {
    List<Brand> findByMulti(Brand brand);

    List<Brand> findByCategory(Integer categoryId);
}
