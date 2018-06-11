package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 * spu销售属性值表
 */
public class SpuSaleAttrValue implements Serializable {

    /**销售属性值编号*/
    @Id
    @Column
    String id ;

    /**商品id*/
    @Column
    String spuId;

    /**销售属性id*/
    @Column
    String saleAttrId;

    /**销售属性值名称*/
    @Column
    String saleAttrValueName;

    public SpuSaleAttrValue() {
    }

    public SpuSaleAttrValue(String id, String spuId, String saleAttrId, String saleAttrValueName) {
        this.id = id;
        this.spuId = spuId;
        this.saleAttrId = saleAttrId;
        this.saleAttrValueName = saleAttrValueName;
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

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }
}
