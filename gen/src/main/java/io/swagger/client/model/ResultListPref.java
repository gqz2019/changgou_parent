/*
 * 代码生成器
 * 微服务工程代码生成器,生成Dao、Service、Controller、Pojo、Feign、Swagger的JSON脚本
 *
 * OpenAPI spec version: 1.0.0
 * Contact: shenkunlin@itcast.cn
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Result
 */
@ApiModel(description = "Result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T20:44:30.905+08:00")
public class ResultListPref {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("data")
  private List<Pref> data = new ArrayList<Pref>();

  @SerializedName("flag")
  private Boolean flag = null;

  @SerializedName("message")
  private String message = null;

  public ResultListPref code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 返回状态码,20000:成功,20001:失败,20002:用户名或密码错误,20003:权限不足,20004:远程调用失败,20005:重复操作,20006:没有对应的数据
   * @return code
  **/
  @ApiModelProperty(required = true, value = "返回状态码,20000:成功,20001:失败,20002:用户名或密码错误,20003:权限不足,20004:远程调用失败,20005:重复操作,20006:没有对应的数据")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ResultListPref data(List<Pref> data) {
    this.data = data;
    return this;
  }

  public ResultListPref addDataItem(Pref dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * 逻辑数据
   * @return data
  **/
  @ApiModelProperty(required = true, value = "逻辑数据")
  public List<Pref> getData() {
    return data;
  }

  public void setData(List<Pref> data) {
    this.data = data;
  }

  public ResultListPref flag(Boolean flag) {
    this.flag = flag;
    return this;
  }

   /**
   * 执行是否成功,true:成功,false:失败
   * @return flag
  **/
  @ApiModelProperty(example = "false", required = true, value = "执行是否成功,true:成功,false:失败")
  public Boolean isFlag() {
    return flag;
  }

  public void setFlag(Boolean flag) {
    this.flag = flag;
  }

  public ResultListPref message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 提示信息
   * @return message
  **/
  @ApiModelProperty(required = true, value = "提示信息")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultListPref resultListPref = (ResultListPref) o;
    return Objects.equals(this.code, resultListPref.code) &&
        Objects.equals(this.data, resultListPref.data) &&
        Objects.equals(this.flag, resultListPref.flag) &&
        Objects.equals(this.message, resultListPref.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, flag, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListPref {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

