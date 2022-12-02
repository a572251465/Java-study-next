package plus.lihh.pojo4;

public class Test {
    public static void main(String[] args) {
        Child child = new Child(22, "lxx", "123");
        Child.say();
        System.out.println(Child.address);
        child.eat();
    }
}
