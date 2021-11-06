# PrefControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](PrefControllerApi.md#addUsingPOST) | **POST** /pref | 添加Pref
[**deleteUsingDELETE**](PrefControllerApi.md#deleteUsingDELETE) | **DELETE** /pref/{id} | 根据ID删除Pref
[**findAllUsingGET**](PrefControllerApi.md#findAllUsingGET) | **GET** /pref | 查询所有Pref
[**findByIdUsingGET**](PrefControllerApi.md#findByIdUsingGET) | **GET** /pref/{id} | 根据ID查询Pref
[**findListUsingPOST**](PrefControllerApi.md#findListUsingPOST) | **POST** /pref/search | 不带分页条件搜索Pref
[**findPageUsingGET**](PrefControllerApi.md#findPageUsingGET) | **GET** /pref/search/{page}/{size} | 分页列表查询Pref
[**findPageUsingPOST**](PrefControllerApi.md#findPageUsingPOST) | **POST** /pref/search/{page}/{size} | 分页条件搜索Pref
[**updateUsingPUT**](PrefControllerApi.md#updateUsingPUT) | **PUT** /pref/{id} | 根据ID修改Pref


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Pref

添加Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Pref body = new Pref(); // Pref | 添加Pref方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pref**](Pref.md)| 添加Pref方法详情 |

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

根据ID删除Pref

根据ID删除Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Object id = null; // Object | 根据ID删除Pref方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Pref方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListPref findAllUsingGET()

查询所有Pref

查询所有Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
try {
    ResultListPref result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListPref**](ResultListPref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultPref findByIdUsingGET(id)

根据ID查询Pref

根据ID查询Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Object id = null; // Object | 根据ID修改Pref方法详情
try {
    ResultPref result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Pref方法详情 |

### Return type

[**ResultPref**](ResultPref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListPref findListUsingPOST(pref)

不带分页条件搜索Pref

不带分页条件搜索Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Pref pref = new Pref(); // Pref | 传入Pref的JSON对象
try {
    ResultListPref result = apiInstance.findListUsingPOST(pref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pref** | [**Pref**](Pref.md)| 传入Pref的JSON对象 | [optional]

### Return type

[**ResultListPref**](ResultListPref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListPref findPageUsingGET(page, size)

分页列表查询Pref

分页列表查询Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListPref result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListPref**](ResultListPref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListPref findPageUsingPOST(page, size, pref)

分页条件搜索Pref

分页条件搜索Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Pref pref = new Pref(); // Pref | 传入Pref的JSON对象
try {
    ResultListPref result = apiInstance.findPageUsingPOST(page, size, pref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **pref** | [**Pref**](Pref.md)| 传入Pref的JSON对象 | [optional]

### Return type

[**ResultListPref**](ResultListPref.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, pref)

根据ID修改Pref

根据ID修改Pref方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrefControllerApi;


PrefControllerApi apiInstance = new PrefControllerApi();
Object id = null; // Object | 根据ID修改Pref方法详情
Pref pref = new Pref(); // Pref | 传入Pref的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, pref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrefControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Pref方法详情 |
 **pref** | [**Pref**](Pref.md)| 传入Pref的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

