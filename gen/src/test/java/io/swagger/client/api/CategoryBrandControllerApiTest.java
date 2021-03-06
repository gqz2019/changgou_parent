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
import io.swagger.client.model.CategoryBrand;
import io.swagger.client.model.Result;
import io.swagger.client.model.ResultCategoryBrand;
import io.swagger.client.model.ResultListCategoryBrand;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for CategoryBrandControllerApi
 */
@Ignore
public class CategoryBrandControllerApiTest {

    private final CategoryBrandControllerApi api = new CategoryBrandControllerApi();

    
    /**
     * 添加CategoryBrand
     *
     * 添加CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUsingPOSTTest() throws ApiException {
        CategoryBrand body = null;
        Result response = api.addUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * 根据ID删除CategoryBrand
     *
     * 根据ID删除CategoryBrand方法详情
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
     * 查询所有CategoryBrand
     *
     * 查询所有CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllUsingGETTest() throws ApiException {
        ResultListCategoryBrand response = api.findAllUsingGET();

        // TODO: test validations
    }
    
    /**
     * 根据ID查询CategoryBrand
     *
     * 根据ID查询CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdUsingGETTest() throws ApiException {
        Object id = null;
        ResultCategoryBrand response = api.findByIdUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * 不带分页条件搜索CategoryBrand
     *
     * 不带分页条件搜索CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findListUsingPOSTTest() throws ApiException {
        CategoryBrand categoryBrand = null;
        ResultListCategoryBrand response = api.findListUsingPOST(categoryBrand);

        // TODO: test validations
    }
    
    /**
     * 分页列表查询CategoryBrand
     *
     * 分页列表查询CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingGETTest() throws ApiException {
        Object page = null;
        Object size = null;
        ResultListCategoryBrand response = api.findPageUsingGET(page, size);

        // TODO: test validations
    }
    
    /**
     * 分页条件搜索CategoryBrand
     *
     * 分页条件搜索CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPageUsingPOSTTest() throws ApiException {
        Object page = null;
        Object size = null;
        CategoryBrand categoryBrand = null;
        ResultListCategoryBrand response = api.findPageUsingPOST(page, size, categoryBrand);

        // TODO: test validations
    }
    
    /**
     * 根据ID修改CategoryBrand
     *
     * 根据ID修改CategoryBrand方法详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUTTest() throws ApiException {
        Object id = null;
        CategoryBrand categoryBrand = null;
        Result response = api.updateUsingPUT(id, categoryBrand);

        // TODO: test validations
    }
    
}
