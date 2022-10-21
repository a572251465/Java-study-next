package com.lihh.service.impl;

import com.lihh.service.DemoService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DemoServiceImpl extends UnicastRemoteObject implements DemoService {

    public DemoServiceImpl() throws RemoteException {}

    @Override
    public String demo(String demo) throws RemoteException {
        return demo + "123";
    }
}
