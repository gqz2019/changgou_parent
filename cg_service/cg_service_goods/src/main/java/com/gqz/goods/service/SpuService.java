package com.gqz.goods.service;

import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Goods;
import com.gqz.goods.pojo.Spu;

/****
 * @Author:admin
 * @Description:Spu业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface SpuService extends CoreService<Spu> {
    /**
     * 保存商品
     * @param goods
     */
    void saveGoods(Goods goods);
    /**
     * 根据SPU的ID查找SPU以及对应的SKU集合
     * @param spuId
     */
    Goods findGoodsById(Long spuId);
}
