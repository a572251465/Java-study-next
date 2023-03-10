package impl;

import interfaces.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫要吃饭了");
    }

    @Override
    public void say() {
        System.out.println("有一个动物 开始说话了");
    }
}
