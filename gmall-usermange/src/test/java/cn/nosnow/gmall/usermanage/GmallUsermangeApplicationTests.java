package cn.nosnow.gmall.usermanage;

import cn.nosnow.gmall.bean.UserAddress;
import cn.nosnow.gmall.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUsermangeApplicationTests {

    @Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
	}

    /**
     * 测试user_address表的联通性
     */
	@Test
	public void userAddress() {
        List<UserAddress> userAddressList = userService.getUserAddressList("1");

        /**增强for循环的快捷方式：iter*/
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
        System.out.println(userAddressList);
    }

}
