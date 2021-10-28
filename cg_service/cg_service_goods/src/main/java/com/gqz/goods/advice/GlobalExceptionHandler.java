package com.gqz.goods.advice;

import com.gqz.common.entity.Result;
import com.gqz.common.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>全局异常处理</p>
 *
 * @author gqz20
 * @create 2021-10-25 18:44
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR, e.getMessage(),null);
    }

    // 商品找不到 有一个异常类  ItemNotFOUNDException
    @ExceptionHandler(value = ItemNotFindException.class)
    @ResponseBody
    public Result handlerException(Exception e) {
        //捕获异常
        e.printStackTrace();
        //处理结果
        return new Result(false, StatusCode.ERROR, e.getMessage());
    }

    private class ItemNotFindException extends Throwable {
    }
    // 订单不到 有一个异常类  OrderNotFOUNDException
}
