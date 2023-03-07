import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.IOC.service.TestUser;
import plus.chendd.IOC.service.impl.TestUserImpl;

public class T001_User {

    @Test
    public void testUser() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
        TestUser testUser = classPathXmlApplicationContext.getBean("testUser", TestUserImpl.class);
        testUser.eat();
    }
}
