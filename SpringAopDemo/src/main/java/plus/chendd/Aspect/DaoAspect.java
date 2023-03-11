package plus.chendd.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class DaoAspect {

    @Pointcut(value = "execution(* plus.chendd.dao.UserDao.addUser(..))")
    public void addPointCut() {}

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("addPointCut()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("beforeMethod ... 前置通知");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    /**
     * 后置通知 无论结果是否异常 都会执行
     */
    @After("addPointCut()")
    public void afterMethod() {
        System.out.println("afterMethod ... 后置通知");
    }

    /**
     * 返回通知 被代理方法执行后 执行此方法，如果发生了异常 不执行此方法
     * @param joinPoint
     * @param res
     */
    @AfterReturning(value = "addPointCut()", returning = "res")
    public void afterMethodReturning(JoinPoint joinPoint, Object res) {
        System.out.println(res);
        System.out.println("afterMethodReturning ... 返回通知");
    }

    /**
     * 异常通知 如果方法一旦发生了异常 执行此方法
     * @param ex
     */
    @AfterThrowing(value = "execution(* plus.chendd.dao.UserDao.updateUser(..))", throwing = "ex")
    public void methodAfterThrowing(Exception ex) {
        System.out.println("methodAfterThrowing ... 异常通知");
    }

    /**
     * 环绕通知：被代理的方法执行前后 都会执行此方法
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "addPointCut()")
    public Object methodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("methodAround ... 环绕通知 前");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("methodAround ... 环绕通知 后");
        return o;
    }
}
