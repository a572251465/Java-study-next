package com.lihh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        Person person = new Person();

        ClassLoader classLoader = person.getClass().getClassLoader();
        Class<?>[] interfaces = person.getClass().getInterfaces();

        Dinner dinner = (Dinner)Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object o = null;

                // 对eat方法做增强
                String name = method.getName();
                if ("eat".equals(name)) {
                    System.out.println("-- eat之前进行操作");
                    o = method.invoke(person, args);
                    System.out.println("-- eat之后进行操作");
                } else {
                    o = method.invoke(person, args);
                }

                return o;
            }
        });

        dinner.eat("泡面");
    }
}

interface Dinner {
    void eat(String foodName);
    void drink();
}

class Person implements Dinner {

    @Override
    public void eat(String foodName) {
        System.out.println("我要吃饭：" + foodName);
    }

    @Override
    public void drink() {
        System.out.println("我要喝水");
    }
}
