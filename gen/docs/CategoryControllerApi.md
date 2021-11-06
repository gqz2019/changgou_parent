# CategoryControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](CategoryControllerApi.md#addUsingPOST) | **POST** /category | 添加Category
[**deleteUsingDELETE**](CategoryControllerApi.md#deleteUsingDELETE) | **DELETE** /category/{id} | 根据ID删除Category
[**findAllUsingGET**](CategoryControllerApi.md#findAllUsingGET) | **GET** /category | 查询所有Category
[**findByIdUsingGET**](CategoryControllerApi.md#findByIdUsingGET) | **GET** /category/{id} | 根据ID查询Category
[**findListUsingPOST**](CategoryControllerApi.md#findListUsingPOST) | **POST** /category/search | 不带分页条件搜索Category
[**findPageUsingGET**](CategoryControllerApi.md#findPageUsingGET) | **GET** /category/search/{page}/{size} | 分页列表查询Category
[**findPageUsingPOST**](CategoryControllerApi.md#findPageUsingPOST) | **POST** /category/search/{page}/{size} | 分页条件搜索Category
[**updateUsingPUT**](CategoryControllerApi.md#updateUsingPUT) | **PUT** /category/{id} | 根据ID修改Category


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Category

添加Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Category body = new Category(); // Category | 添加Category方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Category**](Category.md)| 添加Category方法详情 |

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

根据ID删除Category

根据ID删除Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Object id = null; // Object | 根据ID删除Category方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Category方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListCategory findAllUsingGET()

查询所有Category

查询所有Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
try {
    ResultListCategory result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListCategory**](ResultListCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultCategory findByIdUsingGET(id)

根据ID查询Category

根据ID查询Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Object id = null; // Object | 根据ID修改Category方法详情
try {
    ResultCategory result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Category方法详情 |

### Return type

[**ResultCategory**](ResultCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListCategory findListUsingPOST(category)

不带分页条件搜索Category

不带分页条件搜索Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Category category = new Category(); // Category | 传入Category的JSON对象
try {
    ResultListCategory result = apiInstance.findListUsingPOST(category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | [**Category**](Category.md)| 传入Category的JSON对象 | [optional]

### Return type

[**ResultListCategory**](ResultListCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListCategory findPageUsingGET(page, size)

分页列表查询Category

分页列表查询Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListCategory result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListCategory**](ResultListCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListCategory findPageUsingPOST(page, size, category)

分页条件搜索Category

分页条件搜索Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Category category = new Category(); // Category | 传入Category的JSON对象
try {
    ResultListCategory result = apiInstance.findPageUsingPOST(page, size, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **category** | [**Category**](Category.md)| 传入Category的JSON对象 | [optional]

### Return type

[**ResultListCategory**](ResultListCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, category)

根据ID修改Category

根据ID修改Category方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoryControllerApi;


CategoryControllerApi apiInstance = new CategoryControllerApi();
Object id = null; // Object | 根据ID修改Category方法详情
Category category = new Category(); // Category | 传入Category的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Category方法详情 |
 **category** | [**Category**](Category.md)| 传入Category的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

