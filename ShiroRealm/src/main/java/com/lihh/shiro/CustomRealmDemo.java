package com.lihh.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class CustomRealmDemo {

    @Test
    public void customRealmDemo() {
        // 设置自定义的Realm
        CustomRealm customRealm = new CustomRealm();

        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(customRealm);


        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        subject.login(new UsernamePasswordToken("admin", "admin"));

        System.out.println("是否认证:" + subject.isAuthenticated());

        System.out.println("是否包含指定角色(超级管理员)：" + subject.hasRole("超级管理员"));

        System.out.println("是否包含指定权限(user:add):" + subject.isPermitted("user:add"));
    }
}
