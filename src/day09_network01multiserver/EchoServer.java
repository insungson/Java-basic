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
			// ������Ĺ ����
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			// ���ε� ����
			serverSocket.bind(new InetSocketAddress(localhost, SERVER_PORT));
			System.out.println("[server] binding " + localhost + " : " + SERVER_PORT);
			// accept �����(Lisetning ����)
			while (true) {
				Socket socket = serverSocket.accept();
				new EchoServerReceiveThread(socket).start();	//���⼭ ó���� �ϴ°��̴�.	 start�� �����ϸ� EchoServerReceiveThread���� run�� �ڵ�����ȴ�.
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//�ڿ�����
				if (serverSocket != null)
					serverSocket.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
