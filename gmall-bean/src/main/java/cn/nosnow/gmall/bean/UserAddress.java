package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/1.
 * @author bingHeng
 * @date 2018.05.01
 * user_address(用户地址表对应的实体类)
 */
public class UserAddress implements Serializable {

    /**主键Id*/
    @Column
    @Id
    private String id;

    /**用户地址*/
    @Column
    private String userAddress;

    /**用户id*/
    @Column
    private String userId;

    /**收件人*/
    @Column
    private String consignee;

    /**联系方式*/
    @Column
    private String phoneNum;

    /**是否是默认*/
    @Column
    private String isDefault;

    public UserAddress() {
    }

    public UserAddress(String id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public String getId() {
        return id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
