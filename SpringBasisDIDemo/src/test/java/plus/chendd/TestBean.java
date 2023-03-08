package plus.chendd;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.entity.User;

public class TestBean {

    @Test
    public void testBean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringContextTestBean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testAutoImport() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringContextAutoImport.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
