package day08;

import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerSocketTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);	//8888를 하면 포트번호가 자동으로 생성된다.
		System.out.println("클라이언트 연결을 대기중입니다.");
		Socket socket = serverSocket.accept();// 대기중 클라이언트 연결 시 소켓 리턴
		
		System.out.println("클라이언트에서 연결됨."+socket);
		
		socket.close();
		serverSocket.close();
		
	}

}
