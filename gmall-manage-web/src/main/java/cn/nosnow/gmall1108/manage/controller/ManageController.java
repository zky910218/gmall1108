package cn.nosnow.gmall1108.manage.controller;

import cn.nosnow.gmall.bean.BaseAttrInfo;
import cn.nosnow.gmall.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
