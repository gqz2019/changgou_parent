# SkuControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](SkuControllerApi.md#addUsingPOST) | **POST** /sku | 添加Sku
[**deleteUsingDELETE**](SkuControllerApi.md#deleteUsingDELETE) | **DELETE** /sku/{id} | 根据ID删除Sku
[**findAllUsingGET**](SkuControllerApi.md#findAllUsingGET) | **GET** /sku | 查询所有Sku
[**findByIdUsingGET**](SkuControllerApi.md#findByIdUsingGET) | **GET** /sku/{id} | 根据ID查询Sku
[**findListUsingPOST**](SkuControllerApi.md#findListUsingPOST) | **POST** /sku/search | 不带分页条件搜索Sku
[**findPageUsingGET**](SkuControllerApi.md#findPageUsingGET) | **GET** /sku/search/{page}/{size} | 分页列表查询Sku
[**findPageUsingPOST**](SkuControllerApi.md#findPageUsingPOST) | **POST** /sku/search/{page}/{size} | 分页条件搜索Sku
[**updateUsingPUT**](SkuControllerApi.md#updateUsingPUT) | **PUT** /sku/{id} | 根据ID修改Sku


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Sku

添加Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Sku body = new Sku(); // Sku | 添加Sku方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Sku**](Sku.md)| 添加Sku方法详情 |

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

根据ID删除Sku

根据ID删除Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Object id = null; // Object | 根据ID删除Sku方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Sku方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListSku findAllUsingGET()

查询所有Sku

查询所有Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
try {
    ResultListSku result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListSku**](ResultListSku.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultSku findByIdUsingGET(id)

根据ID查询Sku

根据ID查询Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Object id = null; // Object | 根据ID修改Sku方法详情
try {
    ResultSku result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Sku方法详情 |

### Return type

[**ResultSku**](ResultSku.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListSku findListUsingPOST(sku)

不带分页条件搜索Sku

不带分页条件搜索Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Sku sku = new Sku(); // Sku | 传入Sku的JSON对象
try {
    ResultListSku result = apiInstance.findListUsingPOST(sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | [**Sku**](Sku.md)| 传入Sku的JSON对象 | [optional]

### Return type

[**ResultListSku**](ResultListSku.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListSku findPageUsingGET(page, size)

分页列表查询Sku

分页列表查询Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListSku result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListSku**](ResultListSku.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListSku findPageUsingPOST(page, size, sku)

分页条件搜索Sku

分页条件搜索Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Sku sku = new Sku(); // Sku | 传入Sku的JSON对象
try {
    ResultListSku result = apiInstance.findPageUsingPOST(page, size, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **sku** | [**Sku**](Sku.md)| 传入Sku的JSON对象 | [optional]

### Return type

[**ResultListSku**](ResultListSku.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, sku)

根据ID修改Sku

根据ID修改Sku方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SkuControllerApi;


SkuControllerApi apiInstance = new SkuControllerApi();
Object id = null; // Object | 根据ID修改Sku方法详情
Sku sku = new Sku(); // Sku | 传入Sku的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkuControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Sku方法详情 |
 **sku** | [**Sku**](Sku.md)| 传入Sku的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

