package cn.nosnow.gmall.item.controller;

import cn.nosnow.gmall.bean.SkuInfo;
import cn.nosnow.gmall.bean.SkuSaleAttrValue;
import cn.nosnow.gmall.bean.SpuSaleAttr;
import cn.nosnow.gmall.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2018/6/13.
 * @author bingHeng
 */

@Controller
public class ItemController {

    @Reference
    private ManageService manageService;

    @RequestMapping("{skuId}.html")
    public String getSkuInfo(@PathVariable("skuId") String skuId, Model model) {
        SkuInfo skuInfo = manageService.getSkuInfo(skuId);
        List<SpuSaleAttr> saleAttrList = manageService.getSpuSaleAttrListCheckBySku(skuInfo);

        List<SkuSaleAttrValue> saleAttrValueList = manageService.getSkuSaleAttrValueListBySpu(skuInfo.getSpuId());
        /**将查询列表转换成valueid1|valueid2|valueid3 ：skuId 这种形式的哈希表，用于在页面中定位查询，可以使用Map键值对的方式*/
        String valueIdsKey = "";
        Map<String, String> valuesSkuMap = new HashMap<>();
        for(int i = 0; i < saleAttrValueList.size(); i++) {
            SkuSaleAttrValue skuSaleAttrValue = saleAttrValueList.get(i);
            if(valueIdsKey.length() != 0) {
                valueIdsKey = valueIdsKey + "|";
            }
            valueIdsKey = valueIdsKey + skuSaleAttrValue.getSaleAttrValueId();
            /**两种情况重新组合key值， 1. 循环结束 2. 下面的属性值的skuId与当前值不等*/
            if((i+1)== saleAttrValueList.size()||!skuSaleAttrValue.getSkuId().equals(saleAttrValueList.get(i+1).getSkuId())){
                valuesSkuMap.put(valueIdsKey, skuSaleAttrValue.getSkuId());
                valueIdsKey = "";
            }
        }
        /**将map变为Json串*/
        String valuesSkuJson = JSON.toJSONString(valuesSkuMap);


        /**将查询结果扔到前台页面*/
        model.addAttribute("skuInfo",skuInfo);
        model.addAttribute("saleAttrList", saleAttrList);
        model.addAttribute("valuesSkuJson", valuesSkuJson);
        return "item";
    }

    // getSpuSaleAttrListCheckBySku   getSkuSaleAttrValueListBySpu
}
