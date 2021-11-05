package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.dao.CategoryMapper;
import com.gqz.goods.pojo.Category;
import com.gqz.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-11-03 12:11
 **/
@Service
public class CategoryServiceImpl extends CoreServiceImpl<Category> implements CategoryService {
    private CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImpl(Mapper<Category> baseMapper) {
        super(baseMapper, Category.class);
        this.categoryMapper = (CategoryMapper) baseMapper;
    }

    /***
     * 根据父节点ID查询
     * @param pid :父节点ID
     */
    @Override
    public List<Category> findByParentId(Integer pid) {
        Category category = new Category();
        category.setParentId(pid);
        return categoryMapper.select(category);
    }
}
