package com.lihh;

import com.lihh.dao.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }
}
