package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.dao.CategoryMapper;
import com.gqz.goods.dao.TemplateMapper;
import com.gqz.goods.pojo.Category;
import com.gqz.goods.pojo.Template;
import com.gqz.goods.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 20:39
 **/
@Service
public class TemplateServiceImpl extends CoreServiceImpl<Template> implements TemplateService {
    @Autowired
    private CategoryMapper categoryMapper;

    private TemplateMapper templateMapper;

    @Autowired
    public TemplateServiceImpl(Mapper<Template> baseMapper) {
        super(baseMapper, Template.class);
        this.templateMapper = (TemplateMapper) baseMapper;
    }

    /**
     * 根据分类ID查询模板信息
     *
     * @param id
     * @return
     */
    @Override
    public Template findByCategoryId(Integer id) {
        Category category = categoryMapper.selectByPrimaryKey(id);
        Template template = templateMapper.selectByPrimaryKey(category.getTemplateId());

        return template;
    }
}
