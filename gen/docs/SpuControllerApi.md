# SpuControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](SpuControllerApi.md#addUsingPOST) | **POST** /spu | 添加Spu
[**deleteUsingDELETE**](SpuControllerApi.md#deleteUsingDELETE) | **DELETE** /spu/{id} | 根据ID删除Spu
[**findAllUsingGET**](SpuControllerApi.md#findAllUsingGET) | **GET** /spu | 查询所有Spu
[**findByIdUsingGET**](SpuControllerApi.md#findByIdUsingGET) | **GET** /spu/{id} | 根据ID查询Spu
[**findListUsingPOST**](SpuControllerApi.md#findListUsingPOST) | **POST** /spu/search | 不带分页条件搜索Spu
[**findPageUsingGET**](SpuControllerApi.md#findPageUsingGET) | **GET** /spu/search/{page}/{size} | 分页列表查询Spu
[**findPageUsingPOST**](SpuControllerApi.md#findPageUsingPOST) | **POST** /spu/search/{page}/{size} | 分页条件搜索Spu
[**updateUsingPUT**](SpuControllerApi.md#updateUsingPUT) | **PUT** /spu/{id} | 根据ID修改Spu


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Spu

添加Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Spu body = new Spu(); // Spu | 添加Spu方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Spu**](Spu.md)| 添加Spu方法详情 |

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

根据ID删除Spu

根据ID删除Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Object id = null; // Object | 根据ID删除Spu方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Spu方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListSpu findAllUsingGET()

查询所有Spu

查询所有Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
try {
    ResultListSpu result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListSpu**](ResultListSpu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultSpu findByIdUsingGET(id)

根据ID查询Spu

根据ID查询Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Object id = null; // Object | 根据ID修改Spu方法详情
try {
    ResultSpu result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Spu方法详情 |

### Return type

[**ResultSpu**](ResultSpu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListSpu findListUsingPOST(spu)

不带分页条件搜索Spu

不带分页条件搜索Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Spu spu = new Spu(); // Spu | 传入Spu的JSON对象
try {
    ResultListSpu result = apiInstance.findListUsingPOST(spu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spu** | [**Spu**](Spu.md)| 传入Spu的JSON对象 | [optional]

### Return type

[**ResultListSpu**](ResultListSpu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListSpu findPageUsingGET(page, size)

分页列表查询Spu

分页列表查询Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListSpu result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListSpu**](ResultListSpu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListSpu findPageUsingPOST(page, size, spu)

分页条件搜索Spu

分页条件搜索Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Spu spu = new Spu(); // Spu | 传入Spu的JSON对象
try {
    ResultListSpu result = apiInstance.findPageUsingPOST(page, size, spu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **spu** | [**Spu**](Spu.md)| 传入Spu的JSON对象 | [optional]

### Return type

[**ResultListSpu**](ResultListSpu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, spu)

根据ID修改Spu

根据ID修改Spu方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpuControllerApi;


SpuControllerApi apiInstance = new SpuControllerApi();
Object id = null; // Object | 根据ID修改Spu方法详情
Spu spu = new Spu(); // Spu | 传入Spu的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, spu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpuControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Spu方法详情 |
 **spu** | [**Spu**](Spu.md)| 传入Spu的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

