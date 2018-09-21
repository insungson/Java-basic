package day09;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWeb {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);
		
		for(int i=0;i<10;i++) {
			Socket socket = serverSocket.accept();
			OutputStream out = socket.getOutputStream();
			
			String msg = "HELLO JAVA WORLD";
			
			out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());								//
			out.write(new String("Contant - Length : "+msg.getBytes().length+"\r\n").getBytes());	//
			out.write(new String("Content-Type:text/html; charset-UTF-8\r\n\r\n").getBytes());		//�������������� �� 3���� ���������� ó���Ѵ�. ���������� �ڵ�
																									// header������ �������� parse�� �Ѵ�.
			out.write(msg.getBytes());
			out.flush();
			
			out.close();
			socket.close();
		}
		serverSocket.close();
	}

}
