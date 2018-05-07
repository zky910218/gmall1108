package cn.nosnow.gmall1108.manage.controller;

import cn.nosnow.gmall.bean.BaseAttrInfo;
import cn.nosnow.gmall.bean.BaseCatalog1;
import cn.nosnow.gmall.bean.BaseCatalog2;
import cn.nosnow.gmall.bean.BaseCatalog3;
import cn.nosnow.gmall.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.05.07
 */
@Controller
public class AttrManageController {

    @Reference
    private ManageService manageService;

    /**获取一级分类*/
    @RequestMapping(value = "/getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1() {
        return manageService.getCatalog1();
    }

    /**获取二级目录*/
    @RequestMapping(value = "/getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(@RequestParam Map<String, String> map){
        String catalog1Id =   map.get("catalog1Id");
        return manageService.getCatalog2(catalog1Id);
    }

    /**获取三级目录*/
    @RequestMapping(value = "/getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3 (@RequestParam Map<String, String> map) {
        String catalog2Id = map.get("catalog2Id");
        return manageService.getCatalog3(catalog2Id);
    }

    /**获取属性列表*/
    @RequestMapping(value = "/getAttrList")
    @ResponseBody
    public List<BaseAttrInfo> getAttrList(Map<String, String> map) {
        String catalog3Id = map.get("catalog3Id");
        return manageService.getAttrList(catalog3Id);
    }
}
