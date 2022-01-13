import com.learn.spring.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getArray()[0]);
        System.out.println(user.getArray()[1]);
    }
}
