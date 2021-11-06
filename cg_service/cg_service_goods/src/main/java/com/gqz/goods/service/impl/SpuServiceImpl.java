package com.gqz.goods.service.impl;

import com.alibaba.fastjson.JSON;
import com.gqz.common.entity.IdWorker;
import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.dao.BrandDao;
import com.gqz.goods.dao.CategoryMapper;
import com.gqz.goods.dao.SkuMapper;
import com.gqz.goods.dao.SpuMapper;
import com.gqz.goods.pojo.*;
import com.gqz.goods.service.SpuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/****
 * @Author:admin
 * @Description:Spu业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class SpuServiceImpl extends CoreServiceImpl<Spu> implements SpuService {

    private SpuMapper spuMapper;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private BrandDao brandMapper;

    @Autowired
    private SkuMapper skuMapper;

    @Autowired
    public SpuServiceImpl(SpuMapper spuMapper) {
        super(spuMapper, Spu.class);
        this.spuMapper = spuMapper;
    }

    /**
     * 保存商品
     *
     * @param goods
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveGoods(Goods goods) {
        //添加spu
        Spu spu = goods.getSpu();
        if (spu.getId() == null) {
            spu.setId(idWorker.nextId());
            spuMapper.insertSelective(spu);
        } else {
            spuMapper.updateByPrimaryKeySelective(spu);
            Sku sku = new Sku();
            sku.setSpuId(spu.getId());
            skuMapper.delete(sku);
        }

        //添加sku
        List<Sku> skuList = goods.getSkuList();

        Category category = categoryMapper.selectByPrimaryKey(spu.getCategory3Id());
        Brand brand = brandMapper.selectByPrimaryKey(spu.getBrandId());

        String name = spu.getName();
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (Sku sku : skuList) {
            if (StringUtils.isEmpty(sku.getSpec())) {
                sku.setSpec("{}");
            }

            sku.setId(idWorker.nextId());
            //sku的name是由spu的name组合规格完成的
            String spec = sku.getSpec();
            Map specMap = JSON.parseObject(spec, Map.class);
            specMap.forEach((k, v) -> {
                builder.append(" ").append(v);
            });
            sku.setName(builder.toString());

            LocalDateTime now = LocalDateTime.now();
            sku.setCreateTime(now);
            sku.setUpdateTime(now);
            sku.setSpuId(spu.getId());

            sku.setCategoryId(spu.getCategory3Id());
            sku.setCategoryName(category.getName());

            sku.setBrandName(brand.getName());
            skuMapper.insertSelective(sku);
        }


    }

    /**
     * 根据SpuID查询goods信息
     *
     * @param spuId
     * @return
     */
    @Override
    public Goods findGoodsById(Long spuId) {
        //查询Spu
        Spu spu = spuMapper.selectByPrimaryKey(spuId);

        if (spu == null) {
            throw new RuntimeException("根据SpuID查询goods信息失败");
        }
        //查询List<Sku>
        Sku sku = new Sku();
        sku.setSpuId(spuId);
        List<Sku> skus = skuMapper.select(sku);
        //封装Goods
        Goods goods = new Goods();
        goods.setSkuList(skus);
        goods.setSpu(spu);
        return goods;
    }
}
