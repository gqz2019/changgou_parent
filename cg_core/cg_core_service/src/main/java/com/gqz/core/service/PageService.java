package com.gqz.core.service;

import com.github.pagehelper.PageInfo;

/**
 * <p>分页查询</p>
 *
 * @author gqz20
 * @create 2021-10-31 15:23
 **/
public interface PageService<T> {
    /**
     * 分页查询
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageInfo<T> findPage(Integer pageNo, Integer pageSize);

    /**
     * 分页条件查询
     *
     * @param pageNo
     * @param pageSize
     * @param record
     * @return
     */
    PageInfo<T> findPage(Integer pageNo, Integer pageSize, T record);

    /**
     * 根据查询条件example来分页查询
     *
     * @param pageNo
     * @param pageSize
     * @param example
     * @return
     */
    PageInfo<T> findPageExample(Integer pageNo, Integer pageSize, Object example);
}
