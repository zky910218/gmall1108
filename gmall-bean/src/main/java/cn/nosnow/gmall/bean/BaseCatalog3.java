package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.05.07
 * 菜单分类实体类-三级菜单
 */
public class BaseCatalog3 implements Serializable{

    /**主键： 三级分类Id*/
    @Id
    @Column
    private String id;

    /**三级分类名称*/
    @Column
    private String name;

    /**二级分类Id*/
    @Column
    private String catalog2Id;

    public BaseCatalog3() {
    }

    public BaseCatalog3(String id, String name, String catalog2Id) {
        this.id = id;
        this.name = name;
        this.catalog2Id = catalog2Id;
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

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
