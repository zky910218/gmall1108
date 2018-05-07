package cn.nosnow.gmall1108.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Think on 2018/5/4.
 * @author bingHeng
 * @date 2018.05.04
 */
@Controller
public class ManageController {

    @RequestMapping("index")
    public String index() {

        return "index";
    }

    @RequestMapping("attrListPage")
    public String attrListPage() {
        return "attrListPage";
    }
}
