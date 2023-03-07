package plus.chendd.IOC.service.impl;

import plus.chendd.IOC.service.TestUser;

public class TestUserImpl implements TestUser {
    @Override
    public void eat() {
        System.out.println("test service eat invoke");
    }
}
