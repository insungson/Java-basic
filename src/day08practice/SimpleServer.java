package day08practice;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("���� �غ� ��");
		
		Socket socket = serverSocket.accept();
		System.out.println("Ŭ���̾�Ʈ �����");
		
		byte[] arr = "�ȳ��ϼ���!!!".getBytes();
		OutputStream out = socket.getOutputStream();
		out.write(arr);
		out.flush();//Flushes this output stream and forces any buffered output bytesto be written out
		System.out.println("Ŭ���̾�Ʈ�� ���ۿϷ�");
		out.close();
		socket.close();
		serverSocket.close();
	}

}
