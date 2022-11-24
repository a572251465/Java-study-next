package com.lihh.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class SimpleAccountRealmDemo1 {

    @Test
    public void accountRealm() {

        // 1. 准备AccountRealm 用来内存存储信息
        SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();
        simpleAccountRealm.addAccount("admin", "admin", "超级管理员", "商家");

        // 2. 准备SecurityManager
        DefaultSecurityManager securityManager = new DefaultSecurityManager();


        // 3. SecurityManager和Realm建立连接
        securityManager.setRealm(simpleAccountRealm);

        // 4. subject和SecurityManager建立联系
        SecurityUtils.setSecurityManager(securityManager);

        // 5. 声明subject
        Subject subject = SecurityUtils.getSubject();

        // 6. 发起认证
        // 如果是随意输入账号 以及密码都是会报错的
        subject.login(new UsernamePasswordToken("admin", "admin"));

        // ??? 判断是否认证通过
        System.out.println(subject.isAuthenticated());

        // 退出登录
//        subject.logout();
//        System.out.println(subject.isAuthenticated());

        // 通过API【hasRole】 可以判断是否存在某种角色  不会报错
        System.out.println("是否存在超级管理员角色：" + subject.hasRole("超级管理员"));

        // check role  无返回值 如果没有角色 直接报错
        subject.checkRole("商家");
    }
}
