package com.gqz.goods.controller;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Para;
import com.gqz.goods.service.ParaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>商品参数</p>
 *
 * @author gqz20
 * @create 2021-10-31 21:03
 **/
@RestController
@RequestMapping("para")
@CrossOrigin
public class ParaController extends AbstractCoreController<Para> {
    private ParaService paraService;
    @Autowired
    public ParaController(CoreService<Para> coreService) {
        super(coreService, Para.class);
        this.paraService= (ParaService) coreService;
    }
    /**
     * 根据分类ID查询参数列表
     * @param id
     * @return
     */
    @GetMapping(value = "/category/{id}")
    public Result<List<Para>> getByCategoryId(@PathVariable(value = "id")Integer id){
        //根据分类ID查询对应的参数信息
        List<Para> paras = paraService.findByCategoryId(id);
        return new Result<>(true, StatusCode.OK, "查询分类对应的品牌成功！", paras);
    }

}

