# ParaControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](ParaControllerApi.md#addUsingPOST) | **POST** /para | 添加Para
[**deleteUsingDELETE**](ParaControllerApi.md#deleteUsingDELETE) | **DELETE** /para/{id} | 根据ID删除Para
[**findAllUsingGET**](ParaControllerApi.md#findAllUsingGET) | **GET** /para | 查询所有Para
[**findByIdUsingGET**](ParaControllerApi.md#findByIdUsingGET) | **GET** /para/{id} | 根据ID查询Para
[**findListUsingPOST**](ParaControllerApi.md#findListUsingPOST) | **POST** /para/search | 不带分页条件搜索Para
[**findPageUsingGET**](ParaControllerApi.md#findPageUsingGET) | **GET** /para/search/{page}/{size} | 分页列表查询Para
[**findPageUsingPOST**](ParaControllerApi.md#findPageUsingPOST) | **POST** /para/search/{page}/{size} | 分页条件搜索Para
[**updateUsingPUT**](ParaControllerApi.md#updateUsingPUT) | **PUT** /para/{id} | 根据ID修改Para


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Para

添加Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Para body = new Para(); // Para | 添加Para方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Para**](Para.md)| 添加Para方法详情 |

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

根据ID删除Para

根据ID删除Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Object id = null; // Object | 根据ID删除Para方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Para方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListPara findAllUsingGET()

查询所有Para

查询所有Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
try {
    ResultListPara result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListPara**](ResultListPara.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultPara findByIdUsingGET(id)

根据ID查询Para

根据ID查询Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Object id = null; // Object | 根据ID修改Para方法详情
try {
    ResultPara result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Para方法详情 |

### Return type

[**ResultPara**](ResultPara.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListPara findListUsingPOST(para)

不带分页条件搜索Para

不带分页条件搜索Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Para para = new Para(); // Para | 传入Para的JSON对象
try {
    ResultListPara result = apiInstance.findListUsingPOST(para);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **para** | [**Para**](Para.md)| 传入Para的JSON对象 | [optional]

### Return type

[**ResultListPara**](ResultListPara.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListPara findPageUsingGET(page, size)

分页列表查询Para

分页列表查询Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListPara result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListPara**](ResultListPara.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListPara findPageUsingPOST(page, size, para)

分页条件搜索Para

分页条件搜索Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Para para = new Para(); // Para | 传入Para的JSON对象
try {
    ResultListPara result = apiInstance.findPageUsingPOST(page, size, para);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **para** | [**Para**](Para.md)| 传入Para的JSON对象 | [optional]

### Return type

[**ResultListPara**](ResultListPara.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, para)

根据ID修改Para

根据ID修改Para方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParaControllerApi;


ParaControllerApi apiInstance = new ParaControllerApi();
Object id = null; // Object | 根据ID修改Para方法详情
Para para = new Para(); // Para | 传入Para的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, para);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParaControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Para方法详情 |
 **para** | [**Para**](Para.md)| 传入Para的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

