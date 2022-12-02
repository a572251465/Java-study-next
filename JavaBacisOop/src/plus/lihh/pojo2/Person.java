package plus.lihh.pojo2;

public class Person {
    private Integer age;
    private String name;
    private String address;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(Integer age, String name) {
        this(name);
        this.age = age;
    }

    public Person(Integer age, String name, String address) {
        this(age, name);
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
