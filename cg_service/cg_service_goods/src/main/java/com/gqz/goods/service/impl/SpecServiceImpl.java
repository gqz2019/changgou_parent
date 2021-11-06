package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.dao.SpecMapper;
import com.gqz.goods.pojo.Spec;
import com.gqz.goods.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 20:54
 **/
@Service
public class SpecServiceImpl extends CoreServiceImpl<Spec> implements SpecService {
    private SpecMapper specMapper;
    @Autowired
    public SpecServiceImpl(Mapper<Spec> baseMapper) {
        super(baseMapper, Spec.class);
        this.specMapper= (SpecMapper) baseMapper;
    }
    /**
     * 根据分类ID查询规格列表
     *
     * @param categoryid
     * @return
     */
    @Override
    public List<Spec> findByCategoryId(Integer categoryid) {
        List<Spec> specs = specMapper.findByCategoryId(categoryid);
        if (specs.isEmpty()){
            throw new RuntimeException("根据分类ID查询规格列表失败");
        }
        return specs;
    }
}
