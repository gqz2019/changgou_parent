package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.pojo.Spec;
import com.gqz.goods.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 20:54
 **/
@Service
public class SpecServiceImpl extends CoreServiceImpl<Spec> implements SpecService {
    @Autowired
    public SpecServiceImpl(Mapper<Spec> baseMapper) {
        super(baseMapper, Spec.class);
    }
}
