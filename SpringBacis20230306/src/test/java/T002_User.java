import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.DI.User;

public class T002_User {

    @Test
    public void testUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext001.xml");
        User user001 = applicationContext.getBean("user001", User.class);
        System.out.println(user001);
    }

    @Test
    public void testUser001() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext001.xml");
        User user001 = applicationContext.getBean("user002", User.class);
        User user002 = applicationContext.getBean("user002", User.class);
        System.out.println(user001 == user002);
    }

    @Test
    public void testSettingName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext002.xml");
        User user002 = applicationContext.getBean("user002", User.class);
        System.out.println(user002);
    }

    @Test
    public void testSettingCat() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext002.xml");
        User user = applicationContext.getBean("user003", User.class);
        System.out.println(user);
    }
}
