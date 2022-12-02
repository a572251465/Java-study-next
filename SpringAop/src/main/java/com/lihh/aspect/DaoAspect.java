package com.lihh.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DaoAspect {

    @Before("execution(* com.lihh.dao.impl.UserDaoImpl.addUser(..))")
    public void beforeMethod() {
        System.out.println("before method...........");
    }
}
