package com.gqz.core.controller;


import com.gqz.common.entity.Result;

/**
 * 描述
 *
 * @author ljh
 * @version 1.0
 * @packagename com.changgou.core.service
 * @date 2020/8/9
 */
public interface IInsertController<T> {
    /**
     * 添加记录
     *
     * @param record
     * @return
     */
    Result insert(T record);

}