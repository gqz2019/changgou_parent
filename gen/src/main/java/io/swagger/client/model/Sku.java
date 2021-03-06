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
 * Sku
 */
@ApiModel(description = "Sku")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T20:44:30.905+08:00")
public class Sku {
  @SerializedName("id")
  private String id = null;

  @SerializedName("sn")
  private String sn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("num")
  private Integer num = null;

  @SerializedName("alertNum")
  private Integer alertNum = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("images")
  private String images = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("spuId")
  private String spuId = null;

  @SerializedName("categoryId")
  private Integer categoryId = null;

  @SerializedName("categoryName")
  private String categoryName = null;

  @SerializedName("brandName")
  private String brandName = null;

  @SerializedName("spec")
  private String spec = null;

  @SerializedName("saleNum")
  private Integer saleNum = null;

  @SerializedName("commentNum")
  private Integer commentNum = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("version")
  private Integer version = null;

  public Sku id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 商品id
   * @return id
  **/
  @ApiModelProperty(value = "商品id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Sku sn(String sn) {
    this.sn = sn;
    return this;
  }

   /**
   * 商品条码
   * @return sn
  **/
  @ApiModelProperty(value = "商品条码")
  public String getSn() {
    return sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }

  public Sku name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SKU名称
   * @return name
  **/
  @ApiModelProperty(value = "SKU名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sku price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 价格（分）
   * @return price
  **/
  @ApiModelProperty(value = "价格（分）")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Sku num(Integer num) {
    this.num = num;
    return this;
  }

   /**
   * 库存数量
   * @return num
  **/
  @ApiModelProperty(value = "库存数量")
  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Sku alertNum(Integer alertNum) {
    this.alertNum = alertNum;
    return this;
  }

   /**
   * 库存预警数量
   * @return alertNum
  **/
  @ApiModelProperty(value = "库存预警数量")
  public Integer getAlertNum() {
    return alertNum;
  }

  public void setAlertNum(Integer alertNum) {
    this.alertNum = alertNum;
  }

  public Sku image(String image) {
    this.image = image;
    return this;
  }

   /**
   * 商品图片
   * @return image
  **/
  @ApiModelProperty(value = "商品图片")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Sku images(String images) {
    this.images = images;
    return this;
  }

   /**
   * 商品图片列表
   * @return images
  **/
  @ApiModelProperty(value = "商品图片列表")
  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }

  public Sku weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * 重量（克）
   * @return weight
  **/
  @ApiModelProperty(value = "重量（克）")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Sku spuId(String spuId) {
    this.spuId = spuId;
    return this;
  }

   /**
   * SPUID
   * @return spuId
  **/
  @ApiModelProperty(value = "SPUID")
  public String getSpuId() {
    return spuId;
  }

  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }

  public Sku categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类目ID
   * @return categoryId
  **/
  @ApiModelProperty(value = "类目ID")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Sku categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 类目名称
   * @return categoryName
  **/
  @ApiModelProperty(value = "类目名称")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Sku brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名称
   * @return brandName
  **/
  @ApiModelProperty(value = "品牌名称")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public Sku spec(String spec) {
    this.spec = spec;
    return this;
  }

   /**
   * 规格
   * @return spec
  **/
  @ApiModelProperty(value = "规格")
  public String getSpec() {
    return spec;
  }

  public void setSpec(String spec) {
    this.spec = spec;
  }

  public Sku saleNum(Integer saleNum) {
    this.saleNum = saleNum;
    return this;
  }

   /**
   * 销量
   * @return saleNum
  **/
  @ApiModelProperty(value = "销量")
  public Integer getSaleNum() {
    return saleNum;
  }

  public void setSaleNum(Integer saleNum) {
    this.saleNum = saleNum;
  }

  public Sku commentNum(Integer commentNum) {
    this.commentNum = commentNum;
    return this;
  }

   /**
   * 评论数
   * @return commentNum
  **/
  @ApiModelProperty(value = "评论数")
  public Integer getCommentNum() {
    return commentNum;
  }

  public void setCommentNum(Integer commentNum) {
    this.commentNum = commentNum;
  }

  public Sku status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 商品状态 1-正常，2-下架，3-删除
   * @return status
  **/
  @ApiModelProperty(value = "商品状态 1-正常，2-下架，3-删除")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Sku version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * 
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sku sku = (Sku) o;
    return Objects.equals(this.id, sku.id) &&
        Objects.equals(this.sn, sku.sn) &&
        Objects.equals(this.name, sku.name) &&
        Objects.equals(this.price, sku.price) &&
        Objects.equals(this.num, sku.num) &&
        Objects.equals(this.alertNum, sku.alertNum) &&
        Objects.equals(this.image, sku.image) &&
        Objects.equals(this.images, sku.images) &&
        Objects.equals(this.weight, sku.weight) &&
        Objects.equals(this.spuId, sku.spuId) &&
        Objects.equals(this.categoryId, sku.categoryId) &&
        Objects.equals(this.categoryName, sku.categoryName) &&
        Objects.equals(this.brandName, sku.brandName) &&
        Objects.equals(this.spec, sku.spec) &&
        Objects.equals(this.saleNum, sku.saleNum) &&
        Objects.equals(this.commentNum, sku.commentNum) &&
        Objects.equals(this.status, sku.status) &&
        Objects.equals(this.version, sku.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sn, name, price, num, alertNum, image, images, weight, spuId, categoryId, categoryName, brandName, spec, saleNum, commentNum, status, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sku {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    alertNum: ").append(toIndentedString(alertNum)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    saleNum: ").append(toIndentedString(saleNum)).append("\n");
    sb.append("    commentNum: ").append(toIndentedString(commentNum)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

