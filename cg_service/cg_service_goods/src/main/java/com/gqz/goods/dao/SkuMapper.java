package com.gqz.goods.dao;

import com.gqz.goods.pojo.Sku;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author:admin
 * @Description:Sku的Dao
 * @Date 2019/6/14 0:12
 **/
@Repository
public interface SkuMapper extends Mapper<Sku> {
}
