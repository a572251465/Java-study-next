import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.lifecycle.Person;

public class T006_TestApplicationContext006 {

    @Test
    public void testPerson() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext006.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("实例化完成");
        System.out.println(person);
        applicationContext.close();
    }
}
