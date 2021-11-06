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
import io.swagger.client.model.ResultListSku;
import io.swagger.client.model.ResultSku;
import io.swagger.client.model.Sku;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for SkuControllerApi
 */
@Ignore
public class SkuControllerApiTest {

    private final SkuControllerApi api = new SkuControllerApi();

    
    /**
     * 添加Sku
     *
     * 添加Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUsingPOSTTest() throws ApiException {
        Sku body = null;
        Result response = api.addUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * 根据ID删除Sku
     *
     * 根据ID删除Sku方法详情
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
     * 查询所有Sku
     *
     * 查询所有Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllUsingGETTest() throws ApiException {
        ResultListSku response = api.findAllUsingGET();

        // TODO: test validations
    }
    
    /**
     * 根据ID查询Sku
     *
     * 根据ID查询Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdUsingGETTest() throws ApiException {
        Object id = null;
        ResultSku response = api.findByIdUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * 不带分页条件搜索Sku
     *
     * 不带分页条件搜索Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findListUsingPOSTTest() throws ApiException {
        Sku sku = null;
        ResultListSku response = api.findListUsingPOST(sku);

        // TODO: test validations
    }
    
    /**
     * 分页列表查询Sku
     *
     * 分页列表查询Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingGETTest() throws ApiException {
        Object page = null;
        Object size = null;
        ResultListSku response = api.findPageUsingGET(page, size);

        // TODO: test validations
    }
    
    /**
     * 分页条件搜索Sku
     *
     * 分页条件搜索Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingPOSTTest() throws ApiException {
        Object page = null;
        Object size = null;
        Sku sku = null;
        ResultListSku response = api.findPageUsingPOST(page, size, sku);

        // TODO: test validations
    }
    
    /**
     * 根据ID修改Sku
     *
     * 根据ID修改Sku方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUTTest() throws ApiException {
        Object id = null;
        Sku sku = null;
        Result response = api.updateUsingPUT(id, sku);

        // TODO: test validations
    }
    
}