package day08practice;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket socket = new Socket("localhost", 8888);
		System.out.println("서버에 연결 성공했습니다.");
		
		InputStream inputStream = socket.getInputStream();
		byte[] buff = new byte[20];
		inputStream.read(buff);
		
		System.out.println(new String(buff));
		
		inputStream.close();
		socket.close();
	}
	

}
