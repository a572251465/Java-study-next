package plus.chendd;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import plus.chendd.config.SpringConfig;
import plus.chendd.controller.UserController;

public class TestAutoWried {

    @Test
    public void testAuto() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.insert();
    }
}
