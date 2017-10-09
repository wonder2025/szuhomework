package com.company.code8.m2;

import com.company.code8.m2.SendThread;

import java.io.IOException;
import java.net.DatagramSocket;

/*
 * 通过多线程改进刚才的聊天程序，这样实现在一个窗口发送和接收数据了
 */
public class ChatRoom {
	public static void main(String[] args) throws IOException {
		//实例化一个发送socket
		DatagramSocket dsSend = new DatagramSocket();
		//实例化一个接收
		DatagramSocket dsReceive = new DatagramSocket(12306);
		//实例化一个发送端
		SendThread st = new SendThread(dsSend);
		//实例化一个接收端
		ReceiveThread rt = new ReceiveThread(dsReceive);
		//实例化一个线程
		Thread t1 = new Thread(st);
		//实例化一个线程
		Thread t2 = new Thread(rt);
		//启动线程
		t1.start();
		//启动线程
		t2.start();
	}
}
