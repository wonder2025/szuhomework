package com.company.code9;//package com.company.code9;//FirstServer.java
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstServer{
    public static void main(String[] args) throws Exception{
        //直接得到注册表的引用并启动注册表
        LocateRegistry.createRegistry(1099);
        RemoteInterface object=new FirstImpl();
        Naming.rebind("rmi://127.0.0.1/RemoteServer",object);
//		Naming.rebind("rmi://localhost/RemoteServer",object);

        System.out.println("I am ready!");
    }
}
