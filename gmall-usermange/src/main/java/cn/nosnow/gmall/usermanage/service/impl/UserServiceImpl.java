package cn.nosnow.gmall.usermanage.service.impl;

import cn.nosnow.gmall.bean.UserAddress;
import cn.nosnow.gmall.bean.UserInfo;
import cn.nosnow.gmall.usermanage.mapper.UserAddressMapper;
import cn.nosnow.gmall.usermanage.mapper.UserInfoMapper;
import cn.nosnow.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by Think on 2018/4/27.
 * @author bingHeng
 * @date 2018.04.28
 */

/**dubbo方式服务端注解*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {

        /**
         * selectAll:Mappper通用接口中查询单表所有数据的方法，没有参数
         */
        List<UserInfo> userInfos = userInfoMapper.selectAll();

        /**
         * select: 根据指定条件查询相应的数据
         */
        UserInfo userInfo = new UserInfo();
        userInfo.setLoginName("xian小微");
        List<UserInfo> select = userInfoMapper.select(userInfo);

        /**
         * like模糊查询，查询所有name姓张的人，且id为4
         */
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("name", "张%").andEqualTo("id", "4");
        List<UserInfo> userInfos1 = userInfoMapper.selectByExample(example);
        return userInfos1;
    }

    @Override
    public void addUser (UserInfo userInfo) {
        /**
         * insert 即使传过来的参数为null，也会作为insert条件插入到数据库中，此时如果数据库有默认值，则可能面临被覆盖的风险
         * 向数据库插入数据不会忽略空值
         * userInfoMapper.insert();
         */

        /**
         * insertSelective 如果传过来的参数为null， 则调用此方法将不会将null值插入进数据库中
         * 向数据库插入数据忽略空值
         * 建议使用此种方法
         */
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public UserInfo getUserInfo(UserInfo userInfoQuery) {
        UserInfo userInfo=null;
        /**根据主键查找数据*/
        userInfo = userInfoMapper.selectByPrimaryKey(userInfoQuery.getId());

        /**按所有非空值查询, 必须只有一行, 否则报错*/
        userInfo = userInfoMapper.selectOne(userInfoQuery);
        return userInfo;
    }

    @Override
    public void delete(UserInfo userInfoQuery) {
        userInfoMapper.deleteByPrimaryKey(userInfoQuery.getId());

        /**按照非空值匹配删除*/
        userInfoMapper.delete(userInfoQuery);

        /**按照条件匹配删除数据*/
        userInfoMapper.deleteByExample(new Example(UserInfo.class));

    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {

        /** 修改用户， 依靠主键去查询， 然后更新其他值， 如果某个值为空， 那么原值被清空 */
//        userInfoMapper.updateByPrimaryKey(userInfo);

        /**修改用户， 依靠主键语句去查询，然后更新其他不为空的值*/
//        userInfoMapper.updateByPrimaryKeySelective(userInfo);

        /**修改用户，依靠自定义条件去拼接*/
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("name", "张%").andEqualTo("id", "4");

        /**
         * updateByExample除了更新指定字段外，还会将该条数据其他字段全部置成null
         * 慎用的方法
         */
//        userInfoMapper.updateByExample(userInfo, example);

        /**
         * updateByExampleSelective 仅仅更新指定字段，对该条数据的其他字段没有影响
         * 常用方法
         */
        userInfoMapper.updateByExampleSelective(userInfo, example);
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> addressList = null;
        UserAddress userAddress = new UserAddress();
        userAddress.setId(userId);
        addressList = userAddressMapper.select(userAddress);
        return addressList;
    }


}
