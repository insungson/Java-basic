package day08;			//server�� �ѱ� ���ؼ� �ʿ��ϴ�. SocketTestŬ����

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("���� �غ� ��");
		
		Socket socket = serverSocket.accept();// ����� Ŭ���̾�Ʈ ���� �� ���� ����
		System.out.println("Ŭ���̾�Ʈ �����");
		
		byte[] arr = "�ȳ��ϼ���!!!".getBytes();		//�ȳ��ϼ��並 ����Ʈ ������ �迭�� �ִ´�
		OutputStream out = socket.getOutputStream();//outputstream���� �����͸� ����.(������.)
		out.write(arr);								//�̰� ���⿡ �Է��Ѵ�. 
		out.flush();
		System.out.println("Ŭ���̾�Ʈ�� ������ ���ۿϷ�");
		out.close();
		socket.close();
		serverSocket.close();
		
	}

}
