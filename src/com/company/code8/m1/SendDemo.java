package com.company.code8.m1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 数据来自于键盘录入
 * 键盘录入数据要自己控制录入结束。
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//新建UDP服务
		DatagramSocket ds = new DatagramSocket();

		//键入的数据存入buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		//读取文件
		while ((line = br.readLine()) != null) {
			//键入886则中断循环
			if ("886".equals(line)) {
				break;
			}

			//获取键入数据的字节信息
			byte[] bys = line.getBytes();
			//封装UDP报文
			DatagramPacket dp = new DatagramPacket(bys, bys.length,
					InetAddress.getByName("localhost"), 12345);

			//发送报文
			ds.send(dp);
		}


		ds.close();
	}
}
