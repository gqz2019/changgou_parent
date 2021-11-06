# UndoLogControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](UndoLogControllerApi.md#addUsingPOST) | **POST** /undoLog | 添加UndoLog
[**deleteUsingDELETE**](UndoLogControllerApi.md#deleteUsingDELETE) | **DELETE** /undoLog/{id} | 根据ID删除UndoLog
[**findAllUsingGET**](UndoLogControllerApi.md#findAllUsingGET) | **GET** /undoLog | 查询所有UndoLog
[**findByIdUsingGET**](UndoLogControllerApi.md#findByIdUsingGET) | **GET** /undoLog/{id} | 根据ID查询UndoLog
[**findListUsingPOST**](UndoLogControllerApi.md#findListUsingPOST) | **POST** /undoLog/search | 不带分页条件搜索UndoLog
[**findPageUsingGET**](UndoLogControllerApi.md#findPageUsingGET) | **GET** /undoLog/search/{page}/{size} | 分页列表查询UndoLog
[**findPageUsingPOST**](UndoLogControllerApi.md#findPageUsingPOST) | **POST** /undoLog/search/{page}/{size} | 分页条件搜索UndoLog
[**updateUsingPUT**](UndoLogControllerApi.md#updateUsingPUT) | **PUT** /undoLog/{id} | 根据ID修改UndoLog


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加UndoLog

添加UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
UndoLog body = new UndoLog(); // UndoLog | 添加UndoLog方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UndoLog**](UndoLog.md)| 添加UndoLog方法详情 |

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

根据ID删除UndoLog

根据ID删除UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
Object id = null; // Object | 根据ID删除UndoLog方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除UndoLog方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListUndoLog findAllUsingGET()

查询所有UndoLog

查询所有UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
try {
    ResultListUndoLog result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListUndoLog**](ResultListUndoLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultUndoLog findByIdUsingGET(id)

根据ID查询UndoLog

根据ID查询UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
Object id = null; // Object | 根据ID修改UndoLog方法详情
try {
    ResultUndoLog result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改UndoLog方法详情 |

### Return type

[**ResultUndoLog**](ResultUndoLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListUndoLog findListUsingPOST(undoLog)

不带分页条件搜索UndoLog

不带分页条件搜索UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
UndoLog undoLog = new UndoLog(); // UndoLog | 传入UndoLog的JSON对象
try {
    ResultListUndoLog result = apiInstance.findListUsingPOST(undoLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **undoLog** | [**UndoLog**](UndoLog.md)| 传入UndoLog的JSON对象 | [optional]

### Return type

[**ResultListUndoLog**](ResultListUndoLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListUndoLog findPageUsingGET(page, size)

分页列表查询UndoLog

分页列表查询UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListUndoLog result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListUndoLog**](ResultListUndoLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListUndoLog findPageUsingPOST(page, size, undoLog)

分页条件搜索UndoLog

分页条件搜索UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
UndoLog undoLog = new UndoLog(); // UndoLog | 传入UndoLog的JSON对象
try {
    ResultListUndoLog result = apiInstance.findPageUsingPOST(page, size, undoLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **undoLog** | [**UndoLog**](UndoLog.md)| 传入UndoLog的JSON对象 | [optional]

### Return type

[**ResultListUndoLog**](ResultListUndoLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, undoLog)

根据ID修改UndoLog

根据ID修改UndoLog方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UndoLogControllerApi;


UndoLogControllerApi apiInstance = new UndoLogControllerApi();
Object id = null; // Object | 根据ID修改UndoLog方法详情
UndoLog undoLog = new UndoLog(); // UndoLog | 传入UndoLog的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, undoLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UndoLogControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改UndoLog方法详情 |
 **undoLog** | [**UndoLog**](UndoLog.md)| 传入UndoLog的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

