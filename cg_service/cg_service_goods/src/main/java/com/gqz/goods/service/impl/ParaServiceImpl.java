package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.pojo.Para;
import com.gqz.goods.service.ParaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-31 21:07
 **/
@Service
public class ParaServiceImpl extends CoreServiceImpl<Para> implements ParaService {
    @Autowired
    public ParaServiceImpl(Mapper<Para> baseMapper) {
        super(baseMapper, Para.class);
    }
}
