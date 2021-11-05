package com.gqz.goods.dao;

import com.gqz.goods.pojo.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>商品分类</p>
 *
 * @author gqz20
 * @create 2021-11-03 12:06
 **/
@Repository
public interface CategoryMapper extends Mapper<Category> {
}
