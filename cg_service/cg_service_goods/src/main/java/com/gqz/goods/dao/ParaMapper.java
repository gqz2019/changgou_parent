package com.gqz.goods.dao;

import com.gqz.goods.pojo.Para;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p>商品参数</p>
 *
 * @author gqz20
 * @create 2021-10-31 21:05
 **/
@Repository
public interface ParaMapper extends Mapper<Para> {
    /**
     * 根据分类ID查询参数列表
     * @param id
     * @return
     */
    List<Para> findByCategoryId(Integer id);
}
