package cn.nosnow.gmall.usermanage.service;

import cn.nosnow.gmall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * Created by Think on 2018/4/27.
 * @author bingHeng
 * @date 2018.04.28
 */
public interface UserService {

    /**
     * 查询user_info表
     * @return
     */
    List<UserInfo> getUserInfoListAll();

    /**
     * 向user_info表插入一条数据
      * @param userInfo
     */
    void addUser (UserInfo userInfo);

    /**
     * 根据用户参数查询user_info表中的数据
     * @param userInfoQuery
     * @return
     */
    UserInfo getUserInfo(UserInfo userInfoQuery);

    /**
     * 从user_info表删除数据
     * @param userInfoQuery
     */
    void delete(UserInfo userInfoQuery);

    /**
     * 更新user_info表的某条数据
     * @param userInfo
     */
    void updateUserInfo(UserInfo userInfo);



}
