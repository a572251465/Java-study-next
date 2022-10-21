package com.lihh;

import com.lihh.service.DemoService;
import com.lihh.service.impl.DemoServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class DemoServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        // 创建接口实例
        DemoService demoService = new DemoServiceImpl();
        // 创建注册表
        LocateRegistry.createRegistry(8989);
        // 绑定服务
        Naming.bind("rmi://localhost:8989/demoService", demoService);

        System.out.println("服务启动成功");
    }
}
