package com.gqz.goods.feign;

import com.github.pagehelper.PageInfo;
import com.gqz.common.entity.Result;
import com.gqz.goods.pojo.Template;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/18 13:58
 *****/
@FeignClient(name = "goods-server")
@RequestMapping("/template")
public interface TemplateFeign {

    /***
     * Template分页条件搜索实现
     * @param template
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}")
    Result<PageInfo> findPage(@RequestBody(required = false) Template template, @PathVariable(name = "page") int page, @PathVariable(name = "size") int size);

    /***
     * Template分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}")
    Result<PageInfo> findPage(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size);

    /***
     * 多条件搜索品牌数据
     * @param template
     * @return
     */
    @PostMapping(value = "/search")
    Result<List<Template>> findList(@RequestBody(required = false) Template template);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    Result delete(@PathVariable Integer id);

    /***
     * 修改Template数据
     * @param template
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    Result update(@RequestBody Template template, @PathVariable(name = "id") Integer id);

    /***
     * 新增Template数据
     * @param template
     * @return
     */
    @PostMapping
    Result add(@RequestBody Template template);

    /***
     * 根据ID查询Template数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<Template> findById(@PathVariable(name = "id") Integer id);

    /***
     * 查询Template全部数据
     * @return
     */
    @GetMapping
    Result<List<Template>> findAll();
}