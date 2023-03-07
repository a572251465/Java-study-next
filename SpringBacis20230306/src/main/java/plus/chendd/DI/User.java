package plus.chendd.DI;

public class User {
    private String name;

    private int age;

    private Cat cat;

    public User(String name, int age, Cat cat) {
        System.out.println("allArgsConstructor");
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public User() {
        System.out.println("noArgsConstructor");
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge");
        this.age = age;
    }

    public void setCat(Cat cat) {
        System.out.println("setCat");
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }
}
