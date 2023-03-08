import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.DI.User;

public class T004_Test {

    @Test
    public void testUser() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext005.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
