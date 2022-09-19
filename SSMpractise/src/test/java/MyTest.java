import com.zhezhi.pojo.User;
import com.zhezhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Program: springMVC
 * @ClassName: MyTest
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-17 11:03
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class MyTest {
    @Autowired
    UserService userService;
    @Test
    public void testSelectUserPage() {
        List<User> userList = userService.selectUserPage("张", "", 0);
        userList.forEach(System.out::println);
    }
}
