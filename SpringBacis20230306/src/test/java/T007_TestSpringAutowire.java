import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.lifecycle.Person;

public class T007_TestSpringAutowire {

    @Test
    public void testPerson() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringAutowire.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
