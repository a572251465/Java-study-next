import impl.Cat;
import interfaces.Animal;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJdkProxy {

    @Test
    public void testJdkProxy() {
        Animal cat = new Cat();
        /**
         * ClassLoader loader => 通过实例获取Class。 再通过Class来获取对应的loader
         * Class<?>[] interfaces => 通过实例获取Class。 再通过Class来获取定义的接口
         * InvocationHandler h
         */
        Animal animal = (Animal) Proxy.newProxyInstance(cat.getClass().getClassLoader(), cat.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * proxy 被代理的对象
                 * method 代理的方法
                 * args 代理传递的参数
                 */
                Object o;
                if (method.getName() == "eat") {
                    System.out.println("start ----------------");
                    o = method.invoke(cat, args);
                    System.out.println("end   ----------------");
                } else {
                    o = method.invoke(cat, args);
                }
                return o;
            }
        });

        animal.eat();
        animal.say();
    }
}
