package com.gqz.goods.service;

import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Category;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-11-03 12:08
 **/
public interface CategoryService extends CoreService<Category> {
    /***
     * 根据父节点ID查询
     * @param pid:父节点ID
     */
    List<Category> findByParentId(Integer pid);
}
