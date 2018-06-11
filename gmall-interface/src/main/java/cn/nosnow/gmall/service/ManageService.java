package cn.nosnow.gmall.service;

import cn.nosnow.gmall.bean.*;

import java.util.List;

/**
 * Created by Think on 2018/5/7.
 * @author bingheng
 * @date 2018.05.07
 */
public interface ManageService {

    /**查询一级菜单数据*/
    List<BaseCatalog1> getCatalog1();

    /**根据一级菜单id，查询二级菜单数据*/
    List<BaseCatalog2> getCatalog2(String catalog1Id);

    /**根据二级菜单id，查询三级菜单数据*/
    List<BaseCatalog3> getCatalog3(String catalog2Id);

    /**根据三级菜单id， 查询BaseAttrInfo数据*/
    List<BaseAttrInfo> getAttrList(String catalog3Id);

    /**保存数据*/
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**获取商品List*/
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    /**销售属性页面下拉列表sql*/
    List<BaseSaleAttr> getBaseSaleAttrList();

    /***
     * 保存spu界面数据
     * @param spuInfo
     * @return
     */
    void saveSpuInfo(SpuInfo spuInfo);

}
