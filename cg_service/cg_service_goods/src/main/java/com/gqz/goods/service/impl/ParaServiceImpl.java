package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.dao.ParaMapper;
import com.gqz.goods.pojo.Para;
import com.gqz.goods.service.ParaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 21:07
 **/
@Service
public class ParaServiceImpl extends CoreServiceImpl<Para> implements ParaService {
    private ParaMapper paraMapper;
    @Autowired
    public ParaServiceImpl(Mapper<Para> baseMapper) {
        super(baseMapper, Para.class);
        this.paraMapper= (ParaMapper) baseMapper;
    }

    /**
     * 根据分类ID查询参数列表
     *
     * @param id
     * @return
     */
    @Override
    public List<Para> findByCategoryId(Integer id) {
        List<Para> paras = paraMapper.findByCategoryId(id);
        if (paras.isEmpty()) {
            throw new RuntimeException("根据分类ID查询参数列表失败");
        }
        return paras;
    }
}
