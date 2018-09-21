package day09_network01multiserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static final int SERVER_PORT = 8888;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;

		try {
			// 서버소캣 생성
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			// 바인딩 수행
			serverSocket.bind(new InetSocketAddress(localhost, SERVER_PORT));
			System.out.println("[server] binding " + localhost + " : " + SERVER_PORT);
			// accept 대기중(Lisetning 상태)
			while (true) {
				Socket socket = serverSocket.accept();
				new EchoServerReceiveThread(socket).start();	//여기서 처리를 하는것이다.	 start를 실행하면 EchoServerReceiveThread에서 run이 자동실행된다.
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//자원정리
				if (serverSocket != null)
					serverSocket.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
