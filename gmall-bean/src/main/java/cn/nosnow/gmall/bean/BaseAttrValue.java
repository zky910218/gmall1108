package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.05.07
 *
 * 属性值表
 */
public class BaseAttrValue implements Serializable {

    /**主键 编号*/
    @Id
    @Column
    private String id;

    /**属性值名称*/
    @Column
    private String valueName;

    /**属性Id*/
    @Column
    private String attrId;

    /***/
    @Column
    private String isEnabled;

    public BaseAttrValue() {
    }

    public BaseAttrValue(String id, String valueName, String attrId, String isEnabled) {
        this.id = id;
        this.valueName = valueName;
        this.attrId = attrId;
        this.isEnabled = isEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
}
