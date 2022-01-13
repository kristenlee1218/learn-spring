import com.learn.spring.controller.UserController;
import com.learn.spring.dao.UserDao;
import com.learn.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class DemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        UserController userController = (UserController) context.getBean("userController");
        UserController userController = (UserController) context.getBean("uc");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        UserDao userDao = (UserDao) context.getBean("userDaoImpl");
        System.out.println(userController);
        System.out.println(userService);
        System.out.println(userDao);
    }
}