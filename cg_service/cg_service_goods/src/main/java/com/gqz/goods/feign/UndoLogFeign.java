package com.gqz.goods.feign;

import com.github.pagehelper.PageInfo;
import com.gqz.common.entity.Result;
import com.gqz.goods.pojo.UndoLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/18 13:58
 *****/
@FeignClient(name = "goods-server")
@RequestMapping("/undoLog")
public interface UndoLogFeign {

    /***
     * UndoLog分页条件搜索实现
     * @param undoLog
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}")
    Result<PageInfo> findPage(@RequestBody(required = false) UndoLog undoLog, @PathVariable(name = "page") int page, @PathVariable(name = "size") int size);

    /***
     * UndoLog分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}")
    Result<PageInfo> findPage(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size);

    /***
     * 多条件搜索品牌数据
     * @param undoLog
     * @return
     */
    @PostMapping(value = "/search")
    Result<List<UndoLog>> findList(@RequestBody(required = false) UndoLog undoLog);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    Result delete(@PathVariable Long id);

    /***
     * 修改UndoLog数据
     * @param undoLog
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    Result update(@RequestBody UndoLog undoLog, @PathVariable(name = "id") Long id);

    /***
     * 新增UndoLog数据
     * @param undoLog
     * @return
     */
    @PostMapping
    Result add(@RequestBody UndoLog undoLog);

    /***
     * 根据ID查询UndoLog数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<UndoLog> findById(@PathVariable(name = "id") Long id);

    /***
     * 查询UndoLog全部数据
     * @return
     */
    @GetMapping
    Result<List<UndoLog>> findAll();
}