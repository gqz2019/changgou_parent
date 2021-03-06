package com.gqz.goods.controller;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.core.controller.AbstractCoreController;
import com.gqz.goods.pojo.Goods;
import com.gqz.goods.pojo.Spu;
import com.gqz.goods.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/spu")
@CrossOrigin
public class SpuController extends AbstractCoreController<Spu> {

    private SpuService spuService;

    @Autowired
    public SpuController(SpuService spuService) {
        super(spuService, Spu.class);
        this.spuService = spuService;
    }
    /**
     * 添加Goods
     * @param goods
     * @return
     */
    @PostMapping("/save")
    public Result save(@RequestBody Goods goods){
        spuService.saveGoods(goods);
        return new Result(true, StatusCode.OK,"保存成功");
    }
    /**
     * 根据ID查询Goods
     * @param id
     * @return
     */
    @GetMapping("/goods/{id}")
    public Result<Goods> findGoodsById(@PathVariable Long id){
        //根据ID查询Goods(SPU+SKU)信息
        Goods goods = spuService.findGoodsById(id);
        return new Result<Goods>(true,StatusCode.OK,"查询成功",goods);
    }
}
