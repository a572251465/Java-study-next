package plus.lihh.pojo4;

public class Person {
    int age;
    String name;
    static String address = "我是一个静态address";
    private String idcard;

    public Person(int age, String name, String idcard) {
        this.age = age;
        this.name = name;
        this.idcard = idcard;
    }

    public void eat() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(address);
        System.out.println(this.idcard);
    }

    public static void say() {
        System.out.println("这是一个静态方法 say");
    }

}

class Child extends Person {

    public void eat() {
        super.eat();
        System.out.println("我是子类的eat");
    }

    public Child(int age, String name, String idcard) {
        super(age, name, idcard);
    }
}
