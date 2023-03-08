package plus.chendd.bean;

import org.springframework.beans.factory.FactoryBean;
import plus.chendd.DI.User;

public class MyBeanFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("test-lihh");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
