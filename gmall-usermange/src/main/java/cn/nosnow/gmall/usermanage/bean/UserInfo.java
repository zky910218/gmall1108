package cn.nosnow.gmall.usermanage.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by Think on 2018/4/30.
 * @author bingHeng
 * @dat 2018.04.30
 * bean类中的注解为通用Mapper中的注解
 */
public class UserInfo implements Serializable {

    /**主键：编号*/
    @Id
    @Column
    private String id;

    /**用户名称*/
    @Column
    private String loginName;

    /**用户昵称*/
    @Column
    private String nickName;

    /**用户密码*/
    @Column
    private String passwd;

    /**用户姓名*/
    @Column
    private String name;

    /**手机号*/
    @Column
    private String phoneNum;

    /**邮箱*/
    @Column
    private String email;

    /**头像*/
    @Column
    private String headImg;

    /**用户级别*/
    @Column
    private String userLevel;

    /**不需要与数据库交互的字段，需要增加注解：@Transient(非持久化)*/
    @Transient
    private String balance;

    public UserInfo() {
    }

    public UserInfo(String id, String loginName, String nickName, String passwd, String name, String phoneNum, String email, String headImg, String userLevel, String balance) {
        this.id = id;
        this.loginName = loginName;
        this.nickName = nickName;
        this.passwd = passwd;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.headImg = headImg;
        this.userLevel = userLevel;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public String getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
