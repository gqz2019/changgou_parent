package com.gqz.goods.controller;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.core.controller.AbstractCoreController;
import com.gqz.core.service.CoreService;
import com.gqz.goods.pojo.Spec;
import com.gqz.goods.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>规格管理的控制类</p>
 *
 * @author gqz20
 * @create 2021-10-31 20:57
 **/
@RestController
@RequestMapping("spec")
@CrossOrigin
public class SpecController extends AbstractCoreController<Spec> {
    private SpecService specService;

    @Autowired
    public SpecController(CoreService<Spec> coreService) {
        super(coreService, Spec.class);
        this.specService = (SpecService) coreService;
    }

    /**
     * 根据分类ID查询对应的规格列表
     * @param id
     * @return
     */
    @GetMapping("category/{id}")
    public Result<List<Spec>> findSpecByCategory(@PathVariable(value = "id") Integer id) {

        List<Spec> specs = specService.findByCategoryId(id);

        return new Result<>(true, StatusCode.OK, "根据分类id查询规格成功", specs);
    }

}
