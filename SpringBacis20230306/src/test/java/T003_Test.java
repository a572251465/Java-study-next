import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.DI.Animal;
import plus.chendd.DI.Cat;

public class T003_Test {

    @Test
    public void testCat() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext003.xml");
        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat);
    }

    @Test
    public void testList() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext004.xml");
        Animal animal = applicationContext.getBean("animal", Animal.class);
        System.out.println(animal);
    }
}
