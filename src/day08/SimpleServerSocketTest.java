package day08;

import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerSocketTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);	//8888�� �ϸ� ��Ʈ��ȣ�� �ڵ����� �����ȴ�.
		System.out.println("Ŭ���̾�Ʈ ������ ������Դϴ�.");
		Socket socket = serverSocket.accept();// ����� Ŭ���̾�Ʈ ���� �� ���� ����
		
		System.out.println("Ŭ���̾�Ʈ���� �����."+socket);
		
		socket.close();
		serverSocket.close();
		
	}

}
