package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 * spu销售属性
 */
public class SpuSaleAttr implements Serializable {

    /** 编号(业务中无关联) */
    @Id
    @Column
    String id ;

    /** 商品id */
    @Column
    String spuId;

    /** 销售属性id */
    @Column
    String saleAttrId;

    /** 销售属性名称(冗余) */
    @Column
    String saleAttrName;

    /**spu销售属性值表List*/
    @Transient
    List<SpuSaleAttrValue> spuSaleAttrValueList;

    /***/
    @Transient
    Map spuSaleAttrValueJson;

    public SpuSaleAttr() {
    }

    public SpuSaleAttr(String id, String spuId, String saleAttrId, String saleAttrName, List<SpuSaleAttrValue> spuSaleAttrValueList, Map spuSaleAttrValueJson) {
        this.id = id;
        this.spuId = spuId;
        this.saleAttrId = saleAttrId;
        this.saleAttrName = saleAttrName;
        this.spuSaleAttrValueList = spuSaleAttrValueList;
        this.spuSaleAttrValueJson = spuSaleAttrValueJson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public List<SpuSaleAttrValue> getSpuSaleAttrValueList() {
        return spuSaleAttrValueList;
    }

    public void setSpuSaleAttrValueList(List<SpuSaleAttrValue> spuSaleAttrValueList) {
        this.spuSaleAttrValueList = spuSaleAttrValueList;
    }

    public Map getSpuSaleAttrValueJson() {
        return spuSaleAttrValueJson;
    }

    public void setSpuSaleAttrValueJson(Map spuSaleAttrValueJson) {
        this.spuSaleAttrValueJson = spuSaleAttrValueJson;
    }
}
