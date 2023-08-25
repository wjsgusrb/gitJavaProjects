package com.kh.TCP_Test;
import java.io.*;
import java.net.*;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
public class TCP_Client {
	public static void main(String[]args) {
		System.out.print("client start");
		try {
			Socket socket =new Socket(InetAddress.getByName("localhost"),5000);
			System.out.print("서버접속완료");		
			System.out.print("접속서버IP:"+socket.getInetAddress().getHostAddress());
			
			InputStream is =socket.getInputStream();
			BufferedInputStream br =new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(br);
			
			
			OutputStream os =socket.getOutputStream();
			BufferedOutputStream bos =new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeUTF("안녕하세요.");
			dos.flush();
			String str =dis.readUTF();
			System.out.print(str);
			
		}catch(UnknownHostException e) {
			e.printStackTrace();	
		}	catch(IOException e) {
			e.printStackTrace();
		}


	}
}
