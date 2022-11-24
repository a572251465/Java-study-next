package com.lihh.shiro;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class JdbcRealmDemo {

    @Test
    public void jdbcRealmDemo() {
        // 1. 准备jdbcRealm
        JdbcRealm jdbcRealm = new JdbcRealm();

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/shiro?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        jdbcRealm.setDataSource(druidDataSource);

        jdbcRealm.setPermissionsLookupEnabled(true);


        // 2. 构建SecurityManager绑定Realm
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(jdbcRealm);

        // 3. 基于SecurityUtils绑定SecurityManager并声明subject
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        // 4. 认证操作
        subject.login(new UsernamePasswordToken("admin", "admin"));

        // 角色操作
        System.out.println(subject.hasRole("超级管理员"));

        // 权限操作
        System.out.println(subject.isPermitted("user:add"));
    }
}
