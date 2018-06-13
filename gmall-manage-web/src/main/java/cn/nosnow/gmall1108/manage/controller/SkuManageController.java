package cn.nosnow.gmall1108.manage.controller;

import cn.nosnow.gmall.bean.SkuInfo;
import cn.nosnow.gmall.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Think on 2018/6/13.
 * @author bingHeng
 */
@Controller
public class SkuManageController {

    @Reference
    private ManageService manageService;


    /**
     * 保存sku
     * @param skuInfo
     * @return
     */
    @RequestMapping(value = "saveSku",method = RequestMethod.POST)
    @ResponseBody
    public String saveSkuInfo(SkuInfo skuInfo){
        manageService.saveSkuInfo(skuInfo);
        return "success";
    }

    @RequestMapping(value="skuInfoListBySpu")
    @ResponseBody
    public List<SkuInfo> getSkuInfoListBySpu(HttpServletRequest httpServletRequest){
        String spuId = httpServletRequest.getParameter("spuId");
        List<SkuInfo> skuInfoList = manageService.getSkuInfoListBySpu(spuId);
        return skuInfoList;
    }
}
