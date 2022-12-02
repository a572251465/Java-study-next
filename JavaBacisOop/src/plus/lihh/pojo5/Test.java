package plus.lihh.pojo5;

public class Test {
    public static void main(String[] args) {
        Person person = new Child();
        System.out.println(person.name);

        Child child = (Child) person;
        System.out.println(child.age);
    }
}
