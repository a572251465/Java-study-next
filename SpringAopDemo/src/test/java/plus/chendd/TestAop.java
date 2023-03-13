package plus.chendd;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import plus.chendd.config.SpringConfig;
import plus.chendd.dao.UserDao;
import plus.chendd.dao.impl.ManUserDaoImpl;

public class TestAop {

    @Test
    public void testAop() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = applicationContext.getBean(ManUserDaoImpl.class);
        userDao.addUser("1", "lihh");
//        userDao.updateUser("1", "lihh");
    }
}
