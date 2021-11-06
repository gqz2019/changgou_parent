# AlbumControllerApi

All URIs are relative to *http://127.0.0.1/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](AlbumControllerApi.md#addUsingPOST) | **POST** /album | 添加Album
[**deleteUsingDELETE**](AlbumControllerApi.md#deleteUsingDELETE) | **DELETE** /album/{id} | 根据ID删除Album
[**findAllUsingGET**](AlbumControllerApi.md#findAllUsingGET) | **GET** /album | 查询所有Album
[**findByIdUsingGET**](AlbumControllerApi.md#findByIdUsingGET) | **GET** /album/{id} | 根据ID查询Album
[**findListUsingPOST**](AlbumControllerApi.md#findListUsingPOST) | **POST** /album/search | 不带分页条件搜索Album
[**findPageUsingGET**](AlbumControllerApi.md#findPageUsingGET) | **GET** /album/search/{page}/{size} | 分页列表查询Album
[**findPageUsingPOST**](AlbumControllerApi.md#findPageUsingPOST) | **POST** /album/search/{page}/{size} | 分页条件搜索Album
[**updateUsingPUT**](AlbumControllerApi.md#updateUsingPUT) | **PUT** /album/{id} | 根据ID修改Album


<a name="addUsingPOST"></a>
# **addUsingPOST**
> Result addUsingPOST(body)

添加Album

添加Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Album body = new Album(); // Album | 添加Album方法详情
try {
    Result result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Album**](Album.md)| 添加Album方法详情 |

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

根据ID删除Album

根据ID删除Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Object id = null; // Object | 根据ID删除Album方法详情
try {
    Result result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID删除Album方法详情 |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ResultListAlbum findAllUsingGET()

查询所有Album

查询所有Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
try {
    ResultListAlbum result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListAlbum**](ResultListAlbum.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> ResultAlbum findByIdUsingGET(id)

根据ID查询Album

根据ID查询Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Object id = null; // Object | 根据ID修改Album方法详情
try {
    ResultAlbum result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Album方法详情 |

### Return type

[**ResultAlbum**](ResultAlbum.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findListUsingPOST"></a>
# **findListUsingPOST**
> ResultListAlbum findListUsingPOST(album)

不带分页条件搜索Album

不带分页条件搜索Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Album album = new Album(); // Album | 传入Album的JSON对象
try {
    ResultListAlbum result = apiInstance.findListUsingPOST(album);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#findListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **album** | [**Album**](Album.md)| 传入Album的JSON对象 | [optional]

### Return type

[**ResultListAlbum**](ResultListAlbum.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingGET"></a>
# **findPageUsingGET**
> ResultListAlbum findPageUsingGET(page, size)

分页列表查询Album

分页列表查询Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
try {
    ResultListAlbum result = apiInstance.findPageUsingGET(page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#findPageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |

### Return type

[**ResultListAlbum**](ResultListAlbum.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPageUsingPOST"></a>
# **findPageUsingPOST**
> ResultListAlbum findPageUsingPOST(page, size, album)

分页条件搜索Album

分页条件搜索Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Object page = null; // Object | 当前页
Object size = null; // Object | 每页显示条数
Album album = new Album(); // Album | 传入Album的JSON对象
try {
    ResultListAlbum result = apiInstance.findPageUsingPOST(page, size, album);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#findPageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md)| 当前页 |
 **size** | [**Object**](.md)| 每页显示条数 |
 **album** | [**Album**](Album.md)| 传入Album的JSON对象 | [optional]

### Return type

[**ResultListAlbum**](ResultListAlbum.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Result updateUsingPUT(id, album)

根据ID修改Album

根据ID修改Album方法详情

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AlbumControllerApi;


AlbumControllerApi apiInstance = new AlbumControllerApi();
Object id = null; // Object | 根据ID修改Album方法详情
Album album = new Album(); // Album | 传入Album的JSON对象
try {
    Result result = apiInstance.updateUsingPUT(id, album);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| 根据ID修改Album方法详情 |
 **album** | [**Album**](Album.md)| 传入Album的JSON对象 | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

