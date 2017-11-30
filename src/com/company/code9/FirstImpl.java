package com.company.code9;//package com.company.code9;

import com.company.code9.RemoteInterface;

import java.rmi.*;
import java.rmi.server.*;

public class FirstImpl extends UnicastRemoteObject implements RemoteInterface {
    static int number=0;
    public FirstImpl() throws RemoteException{
        super();
    }
    public String FirstMethod() {
        number++;
        System.out.println("This is the "+number+"th invocation!");
        return "Nice to meet you!";
    }
}
