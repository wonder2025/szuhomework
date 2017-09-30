package com.company.code8.m1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;



public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//新建UDP服务，端口号是12345
		DatagramSocket ds = new DatagramSocket(12345);
		//循环获取数据包
		while (true) {
			//建立一个空间，用于存储接收到的内容
			byte[] bys = new byte[1024];
			//建立一个UDP包
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			//socket接收数据包
			ds.receive(dp);

			//获取数据包的地址
			String ip = dp.getAddress().getHostAddress();
			//获取数据包的地址
			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println("from " + ip + " data is : " + s);
		}

	
	}
}
