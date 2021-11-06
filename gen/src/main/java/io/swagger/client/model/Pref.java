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

import java.util.Objects;

/**
 * Pref
 */
@ApiModel(description = "Pref")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T20:44:30.905+08:00")
public class Pref {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("cateId")
  private Integer cateId = null;

  @SerializedName("buyMoney")
  private Integer buyMoney = null;

  @SerializedName("preMoney")
  private Integer preMoney = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("state")
  private String state = null;

  public Pref id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Pref cateId(Integer cateId) {
    this.cateId = cateId;
    return this;
  }

   /**
   * 分类ID
   * @return cateId
  **/
  @ApiModelProperty(value = "分类ID")
  public Integer getCateId() {
    return cateId;
  }

  public void setCateId(Integer cateId) {
    this.cateId = cateId;
  }

  public Pref buyMoney(Integer buyMoney) {
    this.buyMoney = buyMoney;
    return this;
  }

   /**
   * 消费金额
   * @return buyMoney
  **/
  @ApiModelProperty(value = "消费金额")
  public Integer getBuyMoney() {
    return buyMoney;
  }

  public void setBuyMoney(Integer buyMoney) {
    this.buyMoney = buyMoney;
  }

  public Pref preMoney(Integer preMoney) {
    this.preMoney = preMoney;
    return this;
  }

   /**
   * 优惠金额
   * @return preMoney
  **/
  @ApiModelProperty(value = "优惠金额")
  public Integer getPreMoney() {
    return preMoney;
  }

  public void setPreMoney(Integer preMoney) {
    this.preMoney = preMoney;
  }

  public Pref type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 类型
   * @return type
  **/
  @ApiModelProperty(value = "类型")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Pref state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 状态
   * @return state
  **/
  @ApiModelProperty(value = "状态")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pref pref = (Pref) o;
    return Objects.equals(this.id, pref.id) &&
        Objects.equals(this.cateId, pref.cateId) &&
        Objects.equals(this.buyMoney, pref.buyMoney) &&
        Objects.equals(this.preMoney, pref.preMoney) &&
        Objects.equals(this.type, pref.type) &&
        Objects.equals(this.state, pref.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cateId, buyMoney, preMoney, type, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pref {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cateId: ").append(toIndentedString(cateId)).append("\n");
    sb.append("    buyMoney: ").append(toIndentedString(buyMoney)).append("\n");
    sb.append("    preMoney: ").append(toIndentedString(preMoney)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

