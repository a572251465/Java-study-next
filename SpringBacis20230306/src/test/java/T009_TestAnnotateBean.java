import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.annotate.controller.TestController;

public class T009_TestAnnotateBean {

    @Test
    public void testAnnotateBean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotateBean.xml");
        TestController testController = applicationContext.getBean("testController", TestController.class);
        testController.insert();
    }
}
