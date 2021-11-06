# CategoryBrandControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](CategoryBrandControllerApi.md#addUsingPOST) | **POST** /categoryBrand | 添加CategoryBrand
[**deleteUsingDELETE**](CategoryBrandControllerApi.md#deleteUsingDELETE) | **DELETE** /categoryBrand/{id} | 根据ID删除CategoryBrand
[**findAllUsingGET**](CategoryBrandControllerApi.md#findAllUsingGET) | **GET** /categoryBrand | 查询所有CategoryBrand
[**findByIdUsingGET**](CategoryBrandControllerApi.md#findByIdUsingGET) | **GET** /categoryBrand/{id} | 根据ID查询CategoryBrand
[**findListUsingPOST**](CategoryBrandControllerApi.md#findListUsingPOST) | **POST** /categoryBrand/search | 不带分页条件搜索CategoryBrand
[**findPageUsingGET**](CategoryBrandControllerApi.md#findPageUsingGET) | **GET** /categoryBrand/search/{page}/{size} | 分页列表查询CategoryBrand
[**findPageUsingPOST**](CategoryBrandControllerApi.md#findPageUsingPOST) | **POST** /categoryBrand/search/{page}/{size} | 分页条件搜索CategoryBrand
[**updateUsingPUT**](CategoryBrandControllerApi.md#updateUsingPUT) | **PUT** /categoryBrand/{id} | 根据ID修改CategoryBrand


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加CategoryBrand

添加CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
CategoryBrand body = new CategoryBrand(); // CategoryBrand | 添加CategoryBrand方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryBrand**](CategoryBrand.md)| 添加CategoryBrand方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> Result deleteUsingDELETE(id)

根据ID删除CategoryBrand

根据ID删除CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
Object id = null; // Object | 根据ID删除CategoryBrand方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除CategoryBrand方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListCategoryBrand findAllUsingGET()

查询所有CategoryBrand

查询所有CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
try {
    ResultListCategoryBrand result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListCategoryBrand**](ResultListCategoryBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultCategoryBrand findByIdUsingGET(id)

根据ID查询CategoryBrand

根据ID查询CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
Object id = null; // Object | 根据ID修改CategoryBrand方法详情
try {
    ResultCategoryBrand result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改CategoryBrand方法详情 |

### Return type

[**ResultCategoryBrand**](ResultCategoryBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListCategoryBrand findListUsingPOST(categoryBrand)

不带分页条件搜索CategoryBrand

不带分页条件搜索CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
CategoryBrand categoryBrand = new CategoryBrand(); // CategoryBrand | 传入CategoryBrand的JSON对象
try {
    ResultListCategoryBrand result = apiInstance.findListUsingPOST(categoryBrand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryBrand** | [**CategoryBrand**](CategoryBrand.md)| 传入CategoryBrand的JSON对象 | [optional]

### Return type

[**ResultListCategoryBrand**](ResultListCategoryBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListCategoryBrand findPageUsingGET(page, size)

分页列表查询CategoryBrand

分页列表查询CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListCategoryBrand result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListCategoryBrand**](ResultListCategoryBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListCategoryBrand findPageUsingPOST(page, size, categoryBrand)

分页条件搜索CategoryBrand

分页条件搜索CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
CategoryBrand categoryBrand = new CategoryBrand(); // CategoryBrand | 传入CategoryBrand的JSON对象
try {
    ResultListCategoryBrand result = apiInstance.findPageUsingPOST(page, size, categoryBrand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **categoryBrand** | [**CategoryBrand**](CategoryBrand.md)| 传入CategoryBrand的JSON对象 | [optional]

### Return type

[**ResultListCategoryBrand**](ResultListCategoryBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, categoryBrand)

根据ID修改CategoryBrand

根据ID修改CategoryBrand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryBrandControllerApi;


CategoryBrandControllerApi apiInstance = new CategoryBrandControllerApi();
Object id = null; // Object | 根据ID修改CategoryBrand方法详情
CategoryBrand categoryBrand = new CategoryBrand(); // CategoryBrand | 传入CategoryBrand的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, categoryBrand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryBrandControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改CategoryBrand方法详情 |
 **categoryBrand** | [**CategoryBrand**](CategoryBrand.md)| 传入CategoryBrand的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

