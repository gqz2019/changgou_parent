package com.gqz.goods.service;

import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Para;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 21:06
 **/
public interface ParaService extends CoreService<Para> {
    /**
     * 根据分类ID查询参数列表
     * @param id
     * @return
     */
    List<Para> findByCategoryId(Integer id);
}
