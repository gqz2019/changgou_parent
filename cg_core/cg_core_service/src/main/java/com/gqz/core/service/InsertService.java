package com.gqz.core.service;

/**
 * <p>插入接口</p>
 *
 * @author gqz20
 * @create 2021-10-31 15:16
 **/
public interface InsertService<T> {
    /**
     * 添加记录
     *
     * @param record
     * @return
     */
    int insert(T record);
}
