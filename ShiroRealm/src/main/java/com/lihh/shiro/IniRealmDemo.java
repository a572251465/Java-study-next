package com.lihh.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class IniRealmDemo {

    @Test
    public void iniRealmDemo() {

        // 1. 构建IniRealm 基于文件来构建数据
        IniRealm iniRealm = new IniRealm("classpath:users.ini");

        // 2. 构建manager 管理realm
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(iniRealm);


        // 3. 基于SecurityUtils绑定SecurityManager并声明subject
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        // 4. 认证操作
        subject.login(new UsernamePasswordToken("admin", "admin"));

        // 进行权限校验
        System.out.println(subject.isPermitted("user:delete"));
        System.out.println(subject.isPermitted("user:select"));

        // 使用check API 如果权限不存在 会直接报错
//        subject.checkPermission("user:select");
    }
}
