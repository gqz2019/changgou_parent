# TemplateControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](TemplateControllerApi.md#addUsingPOST) | **POST** /template | 添加Template
[**deleteUsingDELETE**](TemplateControllerApi.md#deleteUsingDELETE) | **DELETE** /template/{id} | 根据ID删除Template
[**findAllUsingGET**](TemplateControllerApi.md#findAllUsingGET) | **GET** /template | 查询所有Template
[**findByIdUsingGET**](TemplateControllerApi.md#findByIdUsingGET) | **GET** /template/{id} | 根据ID查询Template
[**findListUsingPOST**](TemplateControllerApi.md#findListUsingPOST) | **POST** /template/search | 不带分页条件搜索Template
[**findPageUsingGET**](TemplateControllerApi.md#findPageUsingGET) | **GET** /template/search/{page}/{size} | 分页列表查询Template
[**findPageUsingPOST**](TemplateControllerApi.md#findPageUsingPOST) | **POST** /template/search/{page}/{size} | 分页条件搜索Template
[**updateUsingPUT**](TemplateControllerApi.md#updateUsingPUT) | **PUT** /template/{id} | 根据ID修改Template


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Template

添加Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Template body = new Template(); // Template | 添加Template方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Template**](Template.md)| 添加Template方法详情 |

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

根据ID删除Template

根据ID删除Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Object id = null; // Object | 根据ID删除Template方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Template方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListTemplate findAllUsingGET()

查询所有Template

查询所有Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
try {
    ResultListTemplate result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListTemplate**](ResultListTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultTemplate findByIdUsingGET(id)

根据ID查询Template

根据ID查询Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Object id = null; // Object | 根据ID修改Template方法详情
try {
    ResultTemplate result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Template方法详情 |

### Return type

[**ResultTemplate**](ResultTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListTemplate findListUsingPOST(template)

不带分页条件搜索Template

不带分页条件搜索Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Template template = new Template(); // Template | 传入Template的JSON对象
try {
    ResultListTemplate result = apiInstance.findListUsingPOST(template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template** | [**Template**](Template.md)| 传入Template的JSON对象 | [optional]

### Return type

[**ResultListTemplate**](ResultListTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListTemplate findPageUsingGET(page, size)

分页列表查询Template

分页列表查询Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListTemplate result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListTemplate**](ResultListTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListTemplate findPageUsingPOST(page, size, template)

分页条件搜索Template

分页条件搜索Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Template template = new Template(); // Template | 传入Template的JSON对象
try {
    ResultListTemplate result = apiInstance.findPageUsingPOST(page, size, template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **template** | [**Template**](Template.md)| 传入Template的JSON对象 | [optional]

### Return type

[**ResultListTemplate**](ResultListTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, template)

根据ID修改Template

根据ID修改Template方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateControllerApi;


TemplateControllerApi apiInstance = new TemplateControllerApi();
Object id = null; // Object | 根据ID修改Template方法详情
Template template = new Template(); // Template | 传入Template的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Template方法详情 |
 **template** | [**Template**](Template.md)| 传入Template的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

