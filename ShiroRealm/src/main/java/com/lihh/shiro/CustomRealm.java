package com.lihh.shiro;

import com.alibaba.druid.util.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import pojo.User;

import java.util.HashSet;
import java.util.Set;

public class CustomRealm  extends AuthorizingRealm {

    {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        hashedCredentialsMatcher.setHashIterations(1024);
        this.setCredentialsMatcher(hashedCredentialsMatcher);
    }

    /**
     * 授权方法 对用户进行授权
     * @param principalCollection 授权用户收到信息
     * @return null
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取已经认证用户信息
        User user = (User) principalCollection.getPrimaryPrincipal();

        // 获取角色
        Set<String> roleSet = this.findRolesByUser();
        // 获取权限
        Set<String> permSet = this.findPermsByRoleSet();

        //声明AuthorizationInfo对象作为返回值，传入角色信息和权限信息
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roleSet);
        info.setStringPermissions(permSet);
        return info;
    }

    private Set<String> findPermsByRoleSet() {
        Set<String> set = new HashSet<>();
        set.add("user:add");
        set.add("user:update");
        return set;
    }

    private Set<String> findRolesByUser() {
        Set<String> set = new HashSet<>();
        set.add("超级管理员");
        set.add("运营");
        return set;
    }

    /**
     * 认证方法，只需要完成用户名校验即可，密码校验由Shiro内部完成
     * @param authenticationToken 传递的token
     * @return null
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取传递username
        String username = (String) authenticationToken.getPrincipal();

        // 判断username是否为空
        if (StringUtils.isEmpty(username)) return null;


        // 查询用户信息
        User user = this.findUserByUsername(username);
        if (user == null) return null;

        // 声明AuthenticationInfo对象，并填充用户信息
        SimpleAuthenticationInfo customRealm = new SimpleAuthenticationInfo(user, user.getPassword(), "CustomRealm!!");
        // 设置用户的信息的时候 添加盐值
        customRealm.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
        return customRealm;
    }

    private User findUserByUsername(String username) {
        if ("admin".equals(username)) {
            return new User(1, "admin", "1ebc4dcaf1e21b814ece65f27531f1a9", "weruiothergjkdfnbgjkdfngjkdf");
        }
        return null;
    }
}
