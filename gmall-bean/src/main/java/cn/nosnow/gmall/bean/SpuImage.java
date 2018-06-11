package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 * 商品图片表
 */
public class SpuImage implements Serializable {

    /**编号*/
    @Column
    @Id
    private String id;

    /**商品Id*/
    @Column
    private String spuId;

    /**图片名称*/
    @Column
    private String imgName;

    /**图片路径*/
    @Column
    private String imgUrl;

    public SpuImage() {
    }

    public SpuImage(String id, String spuId, String imgName, String imgUrl) {
        this.id = id;
        this.spuId = spuId;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
