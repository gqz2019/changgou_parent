package com.gqz.goods.dao;

import com.gqz.goods.pojo.Spec;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p>规格管理mapper</p>
 *
 * @author gqz20
 * @create 2021-10-31 20:49
 **/
@Repository
public interface SpecMapper extends Mapper<Spec> {
    /***
     * 根据分类ID查询规格列表
     * @param categoryid
     * @return
     */
    List<Spec> findByCategoryId(Integer categoryid);
}