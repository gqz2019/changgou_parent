package com.gqz.goods.feign;

import com.github.pagehelper.PageInfo;
import com.gqz.common.entity.Result;
import com.gqz.goods.pojo.Album;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/18 13:58
 *****/
@FeignClient(name = "goods-server")
@RequestMapping("/album")
public interface AlbumFeign {

    /***
     * Album分页条件搜索实现
     * @param album
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}")
    Result<PageInfo> findPage(@RequestBody(required = false) Album album, @PathVariable(name = "page") int page, @PathVariable(name = "size") int size);

    /***
     * Album分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}")
    Result<PageInfo> findPage(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size);

    /***
     * 多条件搜索品牌数据
     * @param album
     * @return
     */
    @PostMapping(value = "/search")
    Result<List<Album>> findList(@RequestBody(required = false) Album album);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    Result delete(@PathVariable Long id);

    /***
     * 修改Album数据
     * @param album
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    Result update(@RequestBody Album album, @PathVariable(name = "id") Long id);

    /***
     * 新增Album数据
     * @param album
     * @return
     */
    @PostMapping
    Result add(@RequestBody Album album);

    /***
     * 根据ID查询Album数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<Album> findById(@PathVariable(name = "id") Long id);

    /***
     * 查询Album全部数据
     * @return
     */
    @GetMapping
    Result<List<Album>> findAll();
}