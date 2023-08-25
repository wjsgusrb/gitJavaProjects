package com.kh.TCP_Test;
import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
public class TCP_Server {
	public static void main(String[]args) {
		System.out.println("server start");
		String serverIP =null;
		
		//port는 1024번까지는 이미 사용된 포트여서 사용불가
		
		//1. 서버의 포트번호 정함
		int port =5000;
		//2. 서버용 소켓 객체 생성
		ServerSocket serverSocket =null;
		
		try {
			//server소켓객체생성=>port를 정해줘야한다
		serverSocket= new ServerSocket(port);
		//생성된 serverSocket객체에서 서버의 InetAddress(ip정보를 가진 객체)
		serverIP =serverSocket.getInetAddress().getHostAddress();
		
		
		//accep메서드는 클라이언트의 요청을 기달렸다가
		//요청이 도착하면 해당 소켓정보를 반환해준다
		System.out.println("요청대기중");
		Socket clientSocket =serverSocket.accept();
		//요청받은 clientSocket객체에서 inetaddress(ㅑㅔwjdqhfmf rkwls rorcp)
		//가지고 온뒤 ip를 확인한다
		String clientIP = clientSocket.getInetAddress().getHostAddress();
		System.out.println("client접속확인중..."+clientIP);
		
		InputStream is =clientSocket.getInputStream();
		BufferedInputStream br =new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(br);
		
		
		OutputStream os =clientSocket.getOutputStream();
		BufferedOutputStream bos =new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bos);
		
		String str= dis.readUTF();
		System.out.print(str);
		dos.writeUTF("반갑습니다.");
		dos.flush();//flush()라고 써야 날라간다.

		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
		
		
	}

}
