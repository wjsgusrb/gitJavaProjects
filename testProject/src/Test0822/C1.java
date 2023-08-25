package Test0822;

import java.net.InetAddress;
import java.net.ServerSocket;

public class C1 {
int port =3000;
String serverIP;
try {
	serverIP=​ InetAddress.getInetAddress().getHostAddress();
	//순서꺼꾸로
	Socket socket =new Socket(serverIP,port);
}
//이하코드는 중간생략
} 
public class server(){
	int port=300;
	ServerSocket server;// ->ServerSocket server=null;
	try {
		server=new ServerSocket(port);//server=new ServerSocket(port);
		while(true) {
			Socket client =server.accept();
			//Socket clientsocket =server.accept();
		}
	}
}
