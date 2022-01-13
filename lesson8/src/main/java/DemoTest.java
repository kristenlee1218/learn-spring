import com.learn.spring.service.impl.UserServiceImpl;
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
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        System.out.println(userService.getUserDao());
        System.out.println(userService.getUserName());
    }
}