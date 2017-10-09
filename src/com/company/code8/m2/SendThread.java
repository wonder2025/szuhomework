package com.company.code8.m2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	//定义成员变量
	private DatagramSocket ds;
	//构造函数
	public SendThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			//通过标准输入流获取数据
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = null;
			//阻塞式读取输入的数据
			while ((line = br.readLine()) != null) {
				//如果键入的是886那么客户端循环就终止循环
				if ("886".equals(line)) {
					break;
				}

				//把键入的数据转换成byte数组
				byte[] bys = line.getBytes();
				// DatagramPacket dp = new DatagramPacket(bys, bys.length,
				// InetAddress.getByName("192.168.12.92"), 12345);
				//封装成一个udp包
				DatagramPacket dp = new DatagramPacket(bys, bys.length,
						InetAddress.getByName("localhost"), 12306);
				//通过socket发送udp包
				ds.send(dp);
			}

			//关闭
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
