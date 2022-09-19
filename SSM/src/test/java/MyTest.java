import com.zhezhi.pojo.User;
import com.zhezhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * @Program: springMVC
 * @ClassName: MyTest
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-16 10:11
 **/

@RunWith(SpringJUnit4ClassRunner.class)//启动Spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml", "classpath:applicationContext_service.xml"})
public class MyTest {
    @Autowired
    UserService userService;

    /*
    * List<User> selectUserPage(String userName, String userSex, int startRow);
      int createUser(User user);
      int deleteUserById(String userId);
      int getRowCount(String userName, String userSex);
    * */
    @Test
    public void testSelectUserPage() {
        List<User> userList = userService.selectUserPage("", "", 5);
        userList.forEach(System.out::println);
        String userID = (System.currentTimeMillis()+String.valueOf(Math.random()*1000000)).substring(0,17);
        String s = String.valueOf(Math.random()*1000000);
        System.out.println(s);
    }

    @Test
    public void testGetRowCount() {
        int rowCount = userService.getRowCount("", "");
        System.out.println(rowCount);
    }

    @Test
    public void testCreateUser() {
        User user = new User("11111","身份证","370724199610216911","张松浩","男","26","社畜");
        int result = userService.createUser(user);
        if (result==1){
            testSelectUserPage();
        }
    }

    @Test
    public void testDeleteUserById() {
        int delete = userService.deleteUserById("11111");
        if (delete==1){
            System.out.println("删除成功");
        }

    }
}
