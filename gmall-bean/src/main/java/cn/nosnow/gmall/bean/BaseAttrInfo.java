package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.05.07
 *
 * 属性表
 */
public class BaseAttrInfo implements Serializable {

    /**主键 编号*/
    @Id
    @Column
    private String id;

    /**属性名称*/
    @Column
    private String attrName;

    /**三级分类Id*/
    @Column
    private String catalog3Id;


    @Column
    private String isEnabled;

    public BaseAttrInfo() {
    }

    public BaseAttrInfo(String id, String attrName, String catalog3Id, String isEnabled) {
        this.id = id;
        this.attrName = attrName;
        this.catalog3Id = catalog3Id;
        this.isEnabled = isEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
}