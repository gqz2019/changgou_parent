package com.gqz.core.service;

/**
 * <p>核心crud</p>
 *
 * @author gqz20
 * @create 2021-10-31 15:29
 **/
public interface CoreService<T> extends InsertService<T>, DeleteService<T>, UpdateService<T>, SelectService<T>, PageService<T> {
}
