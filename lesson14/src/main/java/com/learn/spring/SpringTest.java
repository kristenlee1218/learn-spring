package com.learn.spring;

import com.learn.spring.config.SpringConfig;
import com.learn.spring.proxy.DynamicProxy;
import com.learn.spring.service.UserService;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);
        context.refresh();
        //获取接口实例
        UserService service = context.getBean(UserService.class);
        //动态创建实例的代理
        UserService proxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),
                new Class[]{UserService.class}, new DynamicProxy(service));
        //proxy执行方法
        proxy.saveUser();
    }
}
