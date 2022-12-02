package plus.lihh.pojo;

public class Person {
    /*
      成员变量  放置到类中 方法外
     */
    Integer age;
    String name;
    double height;
    double weight;

    public void eat() {
        // 局部变量
        int counter = 0;

        System.out.println(counter ++);
        System.out.println("我在吃饭");
    }

    public void sleep(String address) {
        System.out.println("我在【" + address + "】睡觉");
    }

    public String introduce() {
        return "我的名字是：" + this.name;
    }
}
