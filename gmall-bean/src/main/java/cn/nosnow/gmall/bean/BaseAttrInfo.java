package cn.nosnow.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.05.07
 *
 * 属性表
 *
 * 其中@Transient表示该Bean类对应的数据库表中不包含的字段，这个注解必须要加上否则报错
 */
public class BaseAttrInfo implements Serializable {

    /**主键 编号*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    /**属性和属性值是一对多的关系，so属性的bean中增加一个列表元素*/
    @Transient
    private List<BaseAttrValue> attrValueList;

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

    public List<BaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<BaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }
}