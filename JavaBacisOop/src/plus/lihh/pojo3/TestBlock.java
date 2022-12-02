package plus.lihh.pojo3;

public class TestBlock {

    static {
        System.out.println("1. --------- 静态块");
    }

    {
        System.out.println("2. --------- 构造块");
    }

    public TestBlock() {
        System.out.println("3. --------- 构造函数");
    }

    public void say() {
        {
            System.out.println("4. --------- 普通块");
        }

        System.out.println("5. --------- 普通函数");

        {
            System.out.println("6. --------- 普通块");
        }
    }

    public static void main(String[] args) {
        TestBlock testBlock = new TestBlock();
        testBlock.say();
    }
}
