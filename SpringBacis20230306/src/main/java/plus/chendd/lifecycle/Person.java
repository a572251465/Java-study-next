package plus.chendd.lifecycle;

public class Person {
    private String name;
    private int age;
    private Dog dog;

    public Person() {
        System.out.println("noArgsConstructor");
    }

    public void initMethod() {
        System.out.println("init method");
    }

    public void destroyMethod() {
        System.out.println("destroy method");
    }

    public Person(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
        System.out.println("allArgsConstructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
