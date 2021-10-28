package com.gqz.goods.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:admin
 * @Description:Brand构建
 * @Date 2019/6/14 19:13
 *****/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_brand")
public class Brand implements Serializable {

	//标识他是一个主键
    @Id
	//设置生成主键的策略： 为自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	// column 针对 数据库的表中的字段建立映射关系
    @Column(name = "id")
    private Integer id;//品牌id

    @Column(name = "name")
    private String name;//品牌名称
    @Column(name = "image")
    private String image;//品牌图片地址
    @Column(name = "letter")
    private String letter;//品牌的首字母
    @Column(name = "seq")
    private Integer seq;//排序



}
