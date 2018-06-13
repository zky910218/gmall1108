package cn.nosnow.gmall1108.manage.controller;

import cn.nosnow.gmall.bean.SpuImage;
import cn.nosnow.gmall.bean.SpuInfo;
import cn.nosnow.gmall.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 * @date 2018.05.16
 */

@Controller
public class SpuManageController {

    @Reference
    private ManageService manageService;

    /** 跳转商品信息管理页面 */
    @RequestMapping("spuListPage")
    public String getSpuListPage(){
        return "spuListPage";
    }

    @RequestMapping("spuList")
    @ResponseBody
    public List<SpuInfo> getSpuInfoList(@RequestParam Map<String,String> map){
        String catalog3Id = map.get("catalog3Id");
        SpuInfo spuInfo =new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);
        List<SpuInfo> spuInfoList = manageService.getSpuInfoList(spuInfo);
        return spuInfoList;
    }

    /**
     * 初始化商品图片
     * @param spuId
     * @return
     */
    @RequestMapping(value = "/spuImageList")
    @ResponseBody
    public List<SpuImage> getSpuImageList(@RequestParam("spuId") String spuId) {
        return manageService.getSpuImageList(spuId);
    }
}
