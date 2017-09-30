package cn.itcast_04;

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

		DatagramSocket ds = new DatagramSocket();


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}


			byte[] bys = line.getBytes();

			DatagramPacket dp = new DatagramPacket(bys, bys.length,
					InetAddress.getByName("localhost"), 12345);


			ds.send(dp);
		}


		ds.close();
	}
}
