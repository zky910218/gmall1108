package cn.nosnow.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.0507
 * 菜单分类实体类-二级菜单
 */
public class BaseCatalog2  implements Serializable {

    /**主键：二级分类编号*/
    @Id
    @Column
    private String id;

    /**二级分类名称*/
    @Column
    private String name;

    /**一级分类名称*/
    @Column
    private String catalog1Id;

    public BaseCatalog2() {
    }

    public BaseCatalog2(String id, String name, String catalog1Id) {
        this.id = id;
        this.name = name;
        this.catalog1Id = catalog1Id;
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

    public String getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }
}
