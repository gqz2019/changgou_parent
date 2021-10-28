package com.gqz.goods.controller;

import com.github.pagehelper.PageInfo;
import com.gqz.common.entity.PageResult;
import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import com.gqz.goods.pojo.Brand;
import com.gqz.goods.service.BrandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-25 14:21
 **/
@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    @Qualifier("brandsServiceImpl")
    private BrandsService brandService;

    /***
     * 查询全部数据
     * @return
     */
    @GetMapping("findAll")
    public Result<List<Brand>> findAll() throws Exception {
        List<Brand> brandList = brandService.findAll();
        if (brandList!=null&&brandList.size()>0) {
            return new Result<>(true, StatusCode.OK, "查询成功", brandList);
        } else {
            throw new Exception("查询所有品牌失败");
        }
    }

    /***
     * 根据ID查询品牌数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Brand> findById(@PathVariable Integer id) throws Exception {
        //根据ID查询
        Brand brand = brandService.findById(id);

        if (brand != null) {
            return new Result<>(true, StatusCode.OK, "查询成功", brand);
        } else {
            throw new Exception("根据id查找品牌出错!");
        }

    }

    /**
     * 新增品牌数据
     *
     * @param brand
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Brand brand) {
        brandService.add(brand);
        return new Result(true, StatusCode.OK, "添加成功", null);
    }

    /**
     * 修改品牌数据
     *
     * @param brand
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@RequestBody Brand brand, @PathVariable Integer id) {
        //设置ID
        brand.setId(id);
        //修改数据
        brandService.update(brand);
        return new Result(true, StatusCode.OK, "修改成功", null);
    }

    /**
     * 根据ID删除品牌数据
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Integer id) {
        brandService.delete(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    /**
     * 多条件搜索品牌数据
     *
     * @param brand
     * @return
     */
    @PostMapping(value = "/search")
    public Result<List<Brand>> findList(@RequestBody(required = false) Brand brand) throws Exception {
        List<Brand> list = brandService.findList(brand);
        if (list != null && list.size() > 0) {
            return new Result<>(true, StatusCode.OK, "查询成功", list);
        } else {
            throw new Exception("多条件查询品牌失败！");
        }
    }

    /**
     * 分页搜索实现
     *
     * @param brand
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}")
    public Result<PageResult> findPage(@RequestBody(required = false) Brand brand, @PathVariable int page, @PathVariable int size) throws Exception {
        //执行搜索
        PageInfo<Brand> pageInfo = brandService.findPage(brand, page, size);
        PageResult<Brand> result = new PageResult<>();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());

        if (pageInfo.getTotal() > 0) {
            return new Result(true, StatusCode.OK, "查询成功", result);
        } else {
            throw new Exception("多条件查询品牌失败");
        }
    }
}