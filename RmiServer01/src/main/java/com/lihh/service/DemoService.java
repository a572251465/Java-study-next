package com.lihh.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DemoService extends Remote {
    String demo(String demo) throws RemoteException;
}
