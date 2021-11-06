# SpecControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](SpecControllerApi.md#addUsingPOST) | **POST** /spec | 添加Spec
[**deleteUsingDELETE**](SpecControllerApi.md#deleteUsingDELETE) | **DELETE** /spec/{id} | 根据ID删除Spec
[**findAllUsingGET**](SpecControllerApi.md#findAllUsingGET) | **GET** /spec | 查询所有Spec
[**findByIdUsingGET**](SpecControllerApi.md#findByIdUsingGET) | **GET** /spec/{id} | 根据ID查询Spec
[**findListUsingPOST**](SpecControllerApi.md#findListUsingPOST) | **POST** /spec/search | 不带分页条件搜索Spec
[**findPageUsingGET**](SpecControllerApi.md#findPageUsingGET) | **GET** /spec/search/{page}/{size} | 分页列表查询Spec
[**findPageUsingPOST**](SpecControllerApi.md#findPageUsingPOST) | **POST** /spec/search/{page}/{size} | 分页条件搜索Spec
[**updateUsingPUT**](SpecControllerApi.md#updateUsingPUT) | **PUT** /spec/{id} | 根据ID修改Spec


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Spec

添加Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Spec body = new Spec(); // Spec | 添加Spec方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Spec**](Spec.md)| 添加Spec方法详情 |

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

根据ID删除Spec

根据ID删除Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Object id = null; // Object | 根据ID删除Spec方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Spec方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListSpec findAllUsingGET()

查询所有Spec

查询所有Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
try {
    ResultListSpec result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListSpec**](ResultListSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultSpec findByIdUsingGET(id)

根据ID查询Spec

根据ID查询Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Object id = null; // Object | 根据ID修改Spec方法详情
try {
    ResultSpec result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Spec方法详情 |

### Return type

[**ResultSpec**](ResultSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListSpec findListUsingPOST(spec)

不带分页条件搜索Spec

不带分页条件搜索Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Spec spec = new Spec(); // Spec | 传入Spec的JSON对象
try {
    ResultListSpec result = apiInstance.findListUsingPOST(spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**Spec**](Spec.md)| 传入Spec的JSON对象 | [optional]

### Return type

[**ResultListSpec**](ResultListSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListSpec findPageUsingGET(page, size)

分页列表查询Spec

分页列表查询Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListSpec result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListSpec**](ResultListSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListSpec findPageUsingPOST(page, size, spec)

分页条件搜索Spec

分页条件搜索Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Spec spec = new Spec(); // Spec | 传入Spec的JSON对象
try {
    ResultListSpec result = apiInstance.findPageUsingPOST(page, size, spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **spec** | [**Spec**](Spec.md)| 传入Spec的JSON对象 | [optional]

### Return type

[**ResultListSpec**](ResultListSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, spec)

根据ID修改Spec

根据ID修改Spec方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpecControllerApi;


SpecControllerApi apiInstance = new SpecControllerApi();
Object id = null; // Object | 根据ID修改Spec方法详情
Spec spec = new Spec(); // Spec | 传入Spec的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Spec方法详情 |
 **spec** | [**Spec**](Spec.md)| 传入Spec的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

