package com.gqz.goods.service;

import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Template;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 20:37
 **/
public interface TemplateService extends CoreService<Template> {
    /**
     * 根据分类ID查询模板信息
     * @param id
     * @return
     */
    Template findByCategoryId(Integer id);
}
