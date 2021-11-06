# BrandControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](BrandControllerApi.md#addUsingPOST) | **POST** /brand | 添加Brand
[**deleteUsingDELETE**](BrandControllerApi.md#deleteUsingDELETE) | **DELETE** /brand/{id} | 根据ID删除Brand
[**findAllUsingGET**](BrandControllerApi.md#findAllUsingGET) | **GET** /brand | 查询所有Brand
[**findByIdUsingGET**](BrandControllerApi.md#findByIdUsingGET) | **GET** /brand/{id} | 根据ID查询Brand
[**findListUsingPOST**](BrandControllerApi.md#findListUsingPOST) | **POST** /brand/search | 不带分页条件搜索Brand
[**findPageUsingGET**](BrandControllerApi.md#findPageUsingGET) | **GET** /brand/search/{page}/{size} | 分页列表查询Brand
[**findPageUsingPOST**](BrandControllerApi.md#findPageUsingPOST) | **POST** /brand/search/{page}/{size} | 分页条件搜索Brand
[**updateUsingPUT**](BrandControllerApi.md#updateUsingPUT) | **PUT** /brand/{id} | 根据ID修改Brand


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Brand

添加Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Brand body = new Brand(); // Brand | 添加Brand方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Brand**](Brand.md)| 添加Brand方法详情 |

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

根据ID删除Brand

根据ID删除Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Object id = null; // Object | 根据ID删除Brand方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Brand方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListBrand findAllUsingGET()

查询所有Brand

查询所有Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
try {
    ResultListBrand result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListBrand**](ResultListBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultBrand findByIdUsingGET(id)

根据ID查询Brand

根据ID查询Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Object id = null; // Object | 根据ID修改Brand方法详情
try {
    ResultBrand result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Brand方法详情 |

### Return type

[**ResultBrand**](ResultBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListBrand findListUsingPOST(brand)

不带分页条件搜索Brand

不带分页条件搜索Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Brand brand = new Brand(); // Brand | 传入Brand的JSON对象
try {
    ResultListBrand result = apiInstance.findListUsingPOST(brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | [**Brand**](Brand.md)| 传入Brand的JSON对象 | [optional]

### Return type

[**ResultListBrand**](ResultListBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListBrand findPageUsingGET(page, size)

分页列表查询Brand

分页列表查询Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListBrand result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListBrand**](ResultListBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListBrand findPageUsingPOST(page, size, brand)

分页条件搜索Brand

分页条件搜索Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Brand brand = new Brand(); // Brand | 传入Brand的JSON对象
try {
    ResultListBrand result = apiInstance.findPageUsingPOST(page, size, brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **brand** | [**Brand**](Brand.md)| 传入Brand的JSON对象 | [optional]

### Return type

[**ResultListBrand**](ResultListBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, brand)

根据ID修改Brand

根据ID修改Brand方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandControllerApi;


BrandControllerApi apiInstance = new BrandControllerApi();
Object id = null; // Object | 根据ID修改Brand方法详情
Brand brand = new Brand(); // Brand | 传入Brand的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Brand方法详情 |
 **brand** | [**Brand**](Brand.md)| 传入Brand的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

