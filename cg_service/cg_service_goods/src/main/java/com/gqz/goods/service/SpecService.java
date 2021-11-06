package com.gqz.goods.service;

import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Spec;

import java.util.List;

/**
 * <p>规格管理的业务</p>
 *
 * @author gqz20
 * @create 2021-10-31 20:51
 **/
public interface SpecService extends CoreService<Spec> {
    /**
     * 根据分类ID查询规格列表
     * @param categoryid
     * @return
     */
    List<Spec> findByCategoryId(Integer categoryid);
}
