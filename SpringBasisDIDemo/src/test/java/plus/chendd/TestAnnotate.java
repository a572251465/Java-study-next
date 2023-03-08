package plus.chendd;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import plus.chendd.config.SpringConfig;
import plus.chendd.controller.UserController;

public class TestAnnotate {

    @Test
    public void testAnnotate() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println(userController);
    }
}
