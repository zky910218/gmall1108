package cn.nosnow.gmall.usermanage.controller;

import cn.nosnow.gmall.bean.UserInfo;
import cn.nosnow.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Think on 2018/4/27.
 * @author bingHeng
 * @date 2018.04.28
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("userList")
    public ResponseEntity<List<UserInfo>> userList() {
        List<UserInfo> userInfoListAll = userService.getUserInfoListAll();
        return ResponseEntity.ok(userInfoListAll);
    }

    /**
     * 插入数据
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Void> add(UserInfo userInfo) {
        userService.addUser(userInfo);
        System.out.print("UserInfo" + userInfo);
        return ResponseEntity.ok().build();
    }

    /**
     * 更新数据
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/user" ,method = RequestMethod.PUT)
    public ResponseEntity<Void> update(UserInfo userInfo){
        userService.updateUserInfo(userInfo);
        return ResponseEntity.ok().build();
    }

    /**
     * 删除数据
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/user" ,method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(UserInfo userInfo){
        userService.delete(userInfo);
        return ResponseEntity.ok().build();
    }

    /**
     * 根据条件查询数据
     * @param userInfoQuery
     * @return
     */
    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public ResponseEntity<UserInfo> getUserInfo(UserInfo userInfoQuery){
        UserInfo userInfo = userService.getUserInfo(userInfoQuery);
        return ResponseEntity.ok().body(userInfo);
    }

}
