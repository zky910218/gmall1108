package cn.nosnow.gmall1108.order.controller;

import cn.nosnow.gmall.bean.UserAddress;
import cn.nosnow.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Think on 2018/5/1.
 * @author bingHeng
 * @date 2018.05.01
 */
@Controller
public class OrderController {

    /**dubbo方式消费端注解*/
    @Reference
    private UserService userService;

    @RequestMapping("trade")
    @ResponseBody
    public String trade(HttpServletRequest httpServletRequest) {
        String userId = httpServletRequest.getParameter("userId");
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        String s = JSON.toJSONString(userAddressList);
        return s;
    }
}
