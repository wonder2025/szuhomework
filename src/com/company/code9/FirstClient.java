package com.company.code9;//package com.company.code9;

import com.company.code9.RemoteInterface;

import java.rmi.server.*;
import java.rmi.Naming;
public class FirstClient{
    public static void main(String[] args) throws Exception{
        RemoteInterface localobject= (RemoteInterface)Naming.lookup("rmi://172.31.238.10/RemoteServer");
//        RemoteInterface localobject= (RemoteInterface)Naming.lookup("rmi://127.0.0.1/RemoteServer");
        String s=localobject.FirstMethod();
        System.out.println(s);
        System.out.println("I am also ready!");
    }
}
