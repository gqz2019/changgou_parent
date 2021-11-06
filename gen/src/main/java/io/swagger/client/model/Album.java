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
 * Album
 */
@ApiModel(description = "Album")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T20:44:30.905+08:00")
public class Album {
  @SerializedName("title")
  private String title = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageItems")
  private String imageItems = null;

  public Album title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 相册名称
   * @return title
  **/
  @ApiModelProperty(value = "相册名称")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Album image(String image) {
    this.image = image;
    return this;
  }

   /**
   * 相册封面
   * @return image
  **/
  @ApiModelProperty(value = "相册封面")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Album imageItems(String imageItems) {
    this.imageItems = imageItems;
    return this;
  }

   /**
   * 图片列表
   * @return imageItems
  **/
  @ApiModelProperty(value = "图片列表")
  public String getImageItems() {
    return imageItems;
  }

  public void setImageItems(String imageItems) {
    this.imageItems = imageItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Album album = (Album) o;
    return Objects.equals(this.title, album.title) &&
        Objects.equals(this.image, album.image) &&
        Objects.equals(this.imageItems, album.imageItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, image, imageItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Album {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageItems: ").append(toIndentedString(imageItems)).append("\n");
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
