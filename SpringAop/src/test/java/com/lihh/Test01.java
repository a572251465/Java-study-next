package com.lihh;

import com.lihh.config.SpringSetup;
import com.lihh.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringSetup.class);
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        userService.addUser();
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        userService.addUser();
    }
}
