package com.lihh;

import com.lihh.service.DemoService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientServer {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        DemoService demoService = (DemoService) Naming.lookup("rmi://localhost:8989/demoService");
        System.out.println(demoService.demo("测试"));
    }
}
