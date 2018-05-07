package cn.nosnow.gmall.bean;


import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/7.
 * 菜单分类实体类-一级菜单
 * @author bingHneg
 * @date 2018.05.06
 */
public class BaseCatalog1 implements Serializable {

    /**主键 编号*/
    @Id
    @Column
    private String id;

    /**一级分类名称*/
    @Column
    private String name;

    public BaseCatalog1() {
    }

    public BaseCatalog1(String id, String name) {
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
