package cn.nosnow.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 * @date 2018.05.16
 * 商品表
 */
public class SpuInfo implements Serializable {

    /**商品id*/
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**商品名称*/
    @Column
    private String spuName;

    /**商品描述（后台简述）*/
    @Column
    private String description;

    /**三级分类Id*/
    @Column
    private  String catalog3Id;

    /**SPU销售属性表List*/
    @Transient
    private List<SpuSaleAttr> spuSaleAttrList;

    /**商品图片表List*/
    @Transient
    private List<SpuImage> spuImageList;

    /*@Transient
    private List<SpuPoster> spuPosterList;*/

    public SpuInfo() {
    }

    public SpuInfo(String spuName, String description, String catalog3Id, List<SpuSaleAttr> spuSaleAttrList, List<SpuImage> spuImageList) {
        this.spuName = spuName;
        this.description = description;
        this.catalog3Id = catalog3Id;
        this.spuSaleAttrList = spuSaleAttrList;
        this.spuImageList = spuImageList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public List<SpuSaleAttr> getSpuSaleAttrList() {
        return spuSaleAttrList;
    }

    public void setSpuSaleAttrList(List<SpuSaleAttr> spuSaleAttrList) {
        this.spuSaleAttrList = spuSaleAttrList;
    }

    public List<SpuImage> getSpuImageList() {
        return spuImageList;
    }

    public void setSpuImageList(List<SpuImage> spuImageList) {
        this.spuImageList = spuImageList;
    }
}
