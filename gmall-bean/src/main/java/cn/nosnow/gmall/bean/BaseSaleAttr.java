package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 * 基本销售属性表
 */
public class BaseSaleAttr implements Serializable {

    /**编号*/
    @Id
    @Column
    String id ;

    /**销售属性名称*/
    @Column
    String name;

    public BaseSaleAttr() {
    }

    public BaseSaleAttr(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
