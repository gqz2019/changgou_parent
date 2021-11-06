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
import io.swagger.client.model.Brand;
import io.swagger.client.model.Result;
import io.swagger.client.model.ResultBrand;
import io.swagger.client.model.ResultListBrand;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for BrandControllerApi
 */
@Ignore
public class BrandControllerApiTest {

    private final BrandControllerApi api = new BrandControllerApi();

    
    /**
     * 添加Brand
     *
     * 添加Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUsingPOSTTest() throws ApiException {
        Brand body = null;
        Result response = api.addUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * 根据ID删除Brand
     *
     * 根据ID删除Brand方法详情
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
     * 查询所有Brand
     *
     * 查询所有Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllUsingGETTest() throws ApiException {
        ResultListBrand response = api.findAllUsingGET();

        // TODO: test validations
    }
    
    /**
     * 根据ID查询Brand
     *
     * 根据ID查询Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdUsingGETTest() throws ApiException {
        Object id = null;
        ResultBrand response = api.findByIdUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * 不带分页条件搜索Brand
     *
     * 不带分页条件搜索Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findListUsingPOSTTest() throws ApiException {
        Brand brand = null;
        ResultListBrand response = api.findListUsingPOST(brand);

        // TODO: test validations
    }
    
    /**
     * 分页列表查询Brand
     *
     * 分页列表查询Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingGETTest() throws ApiException {
        Object page = null;
        Object size = null;
        ResultListBrand response = api.findPageUsingGET(page, size);

        // TODO: test validations
    }
    
    /**
     * 分页条件搜索Brand
     *
     * 分页条件搜索Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingPOSTTest() throws ApiException {
        Object page = null;
        Object size = null;
        Brand brand = null;
        ResultListBrand response = api.findPageUsingPOST(page, size, brand);

        // TODO: test validations
    }
    
    /**
     * 根据ID修改Brand
     *
     * 根据ID修改Brand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUTTest() throws ApiException {
        Object id = null;
        Brand brand = null;
        Result response = api.updateUsingPUT(id, brand);

        // TODO: test validations
    }
    
}