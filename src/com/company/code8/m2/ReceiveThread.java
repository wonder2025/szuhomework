package com.company.code8.m2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//接收线程
public class ReceiveThread implements Runnable {
	//声明成员变量
	private DatagramSocket ds;
	//构造函数初始化成员变量
	public ReceiveThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			while (true) {
				//建立一个存储空间
				byte[] bys = new byte[1024];
				//新建一个udp包
				DatagramPacket dp = new DatagramPacket(bys, bys.length);

				//Socket阻塞式接收数据放入udp包中
				ds.receive(dp);

				//获取传过来的包的ip
				String ip = dp.getAddress().getHostAddress();
				//把数据转换成字符串
				String s = new String(dp.getData(), 0, dp.getLength());
				//打印在控制台上
				System.out.println("from " + ip + " data is : " + s);
			}
			//异常处理
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}