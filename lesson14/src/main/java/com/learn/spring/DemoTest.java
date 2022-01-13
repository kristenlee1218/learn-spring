package com.learn.spring;

import com.learn.spring.config.SpringConfig;
import com.learn.spring.proxy.UserServiceProxy;
import com.learn.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class DemoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);
        context.refresh();
        //获取接口实例
        UserService service = context.getBean(UserService.class);
        //创建实例的代理
        UserServiceProxy proxy = new UserServiceProxy(service);
        //执行方法
        proxy.saveUser();
    }

}
