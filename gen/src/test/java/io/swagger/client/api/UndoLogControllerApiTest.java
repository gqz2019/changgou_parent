/*
 * 代码生成器
 * 微服务工程代码生成器,生成Dao、Service、Controller、Pojo、Feign、Swagger的JSON脚本
 *
 * OpenAPI spec version: 1.0.0
 * Contact: shenkunlin@itcast.cn
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Result;
import io.swagger.client.model.ResultListUndoLog;
import io.swagger.client.model.ResultUndoLog;
import io.swagger.client.model.UndoLog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UndoLogControllerApi
 */
@Ignore
public class UndoLogControllerApiTest {

    private final UndoLogControllerApi api = new UndoLogControllerApi();

    
    /**
     * 添加UndoLog
     *
     * 添加UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUsingPOSTTest() throws ApiException {
        UndoLog body = null;
        Result response = api.addUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * 根据ID删除UndoLog
     *
     * 根据ID删除UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingDELETETest() throws ApiException {
        Object id = null;
        Result response = api.deleteUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * 查询所有UndoLog
     *
     * 查询所有UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllUsingGETTest() throws ApiException {
        ResultListUndoLog response = api.findAllUsingGET();

        // TODO: test validations
    }
    
    /**
     * 根据ID查询UndoLog
     *
     * 根据ID查询UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdUsingGETTest() throws ApiException {
        Object id = null;
        ResultUndoLog response = api.findByIdUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * 不带分页条件搜索UndoLog
     *
     * 不带分页条件搜索UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findListUsingPOSTTest() throws ApiException {
        UndoLog undoLog = null;
        ResultListUndoLog response = api.findListUsingPOST(undoLog);

        // TODO: test validations
    }
    
    /**
     * 分页列表查询UndoLog
     *
     * 分页列表查询UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingGETTest() throws ApiException {
        Object page = null;
        Object size = null;
        ResultListUndoLog response = api.findPageUsingGET(page, size);

        // TODO: test validations
    }
    
    /**
     * 分页条件搜索UndoLog
     *
     * 分页条件搜索UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingPOSTTest() throws ApiException {
        Object page = null;
        Object size = null;
        UndoLog undoLog = null;
        ResultListUndoLog response = api.findPageUsingPOST(page, size, undoLog);

        // TODO: test validations
    }
    
    /**
     * 根据ID修改UndoLog
     *
     * 根据ID修改UndoLog方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUTTest() throws ApiException {
        Object id = null;
        UndoLog undoLog = null;
        Result response = api.updateUsingPUT(id, undoLog);

        // TODO: test validations
    }
    
}
