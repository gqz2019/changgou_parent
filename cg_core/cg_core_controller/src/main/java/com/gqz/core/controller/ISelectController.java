package com.gqz.core.controller;


import com.gqz.common.entity.Result;

import java.util.List;

/***
 * 描述
 * @author ljh
 * @packagename com.changgou.core
 * @version 1.0
 * @date 2020/8/10
 */
public interface ISelectController<T> {
    //根据ID 获取信息
    Result<T> findById(Object id);


    //根据ID 获取信息列表
    Result<List<T>> findAll();
}
