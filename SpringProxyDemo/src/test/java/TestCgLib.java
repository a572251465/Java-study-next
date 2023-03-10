import impl.Person;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestCgLib {

    @Test
    public void testCglib() {
        Person person = new Person();

        // 1. 获取Enhancer 对象
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类字节码
        enhancer.setSuperclass(person.getClass());
        // 3. 获取MethodInterceptor对象 用于定义增强规则
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                /**
                 * Object o 生成之后的代理对象
                 * Method method 父类中原本要执行的方法
                 * Object[] objects 传递的参数对象
                 * MethodProxy methodProxy 生成的代理的子类
                 */
                Object res;
                if ("eat".equals(method.getName())) {
                    System.out.println("准备开始吃饭...");
                    res = methodProxy.invokeSuper(o, objects);
                    System.out.println("已经吃饭结束...");
                } else {
                    res = methodProxy.invokeSuper(o, objects);
                }
                return res;
            }
        };
        // 4. 设置执行代理回调函数
        enhancer.setCallback(methodInterceptor);
        // 5. 获取代理对象
        Person person1 = (Person) enhancer.create();
        person1.eat();
        person1.say();
    }
}
