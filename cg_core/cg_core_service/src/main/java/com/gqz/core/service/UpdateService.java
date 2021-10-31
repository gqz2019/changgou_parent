package com.gqz.core.service;

/**
 * 描述
 *
 * @author gqz2019
 * @version 1.0
 */
public interface UpdateService<T> {

    /**
     * 根据对象进行更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
}
