package cn.nosnow.gmall1108.manage.controller;

import cn.nosnow.gmall.bean.BaseAttrInfo;
import cn.nosnow.gmall.bean.BaseSaleAttr;
import cn.nosnow.gmall.bean.SpuInfo;
import cn.nosnow.gmall.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Think on 2018/5/4.
 * @author bingHeng
 * @date 2018.05.04
 */
@Controller
public class ManageController {

    @Reference
    private ManageService manageService;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    /** 跳转基本信息管理 */
    @RequestMapping("attrListPage")
    public String attrListPage() {
        return "attrListPage";
    }

    @RequestMapping(value = "saveAttrInfo",method = RequestMethod.POST)
    @ResponseBody
    public String saveAttrInfo(BaseAttrInfo baseAttrInfo){
        manageService.saveAttrInfo(baseAttrInfo);
        return "success";
    }

    @RequestMapping(value = "baseSaleAttrList")
    @ResponseBody
    public List<BaseSaleAttr> getBaseSaleAttrList() {
        List<BaseSaleAttr> baseSaleAttrList = manageService.getBaseSaleAttrList();
        return baseSaleAttrList;
    }

    /**
     * 编辑spu页面保存按钮
     * @param spuInfo
     * @return
     */
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public ResponseEntity<Void> saveSpuInfo(SpuInfo spuInfo) {
        manageService.saveSpuInfo(spuInfo);
        System.out.println("我到底是个什么鬼啊 ： " +ResponseEntity.ok().build());
        return ResponseEntity.ok().build();
    }

}
