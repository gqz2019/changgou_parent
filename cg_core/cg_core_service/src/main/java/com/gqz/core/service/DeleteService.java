package com.gqz.core.service;

/**
 * <p>删除接口</p>
 *
 * @author gqz20
 * @create 2021-10-31 15:18
 **/
public interface DeleteService<T> {
    /**
     * 根据条件删除
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 根据ID 删除
     *
     * @param id
     * @return
     */
    int deleteById(Object id);
}
