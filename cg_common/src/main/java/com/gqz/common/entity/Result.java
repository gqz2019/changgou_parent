package com.gqz.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>返回前端的类</p>
 *
 * @author gqz20
 * @create 2021-10-23 15:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    /**
     * 是否成功
     */
    private boolean flag;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回数据
     */
    private Object data;
}
