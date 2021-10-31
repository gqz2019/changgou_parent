package com.gqz.core.service;

import java.util.List;

/**
 * <p>普通查询的接口</p>
 *
 * @author gqz20
 * @create 2021-10-31 15:11
 **/
public interface SelectService<T> {
    /**
     * 查询所有
     *
     * @return
     */
    List<T> selectAll();

    /**
     * 通过主key查询
     *
     * @param primaryKey
     * @return
     */
    T selectByPrimaryKey(Object primaryKey);

    /**
     * 根据条件查询
     *
     * @param record
     * @return
     */
    List<T> select(T record);
}
