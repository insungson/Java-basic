package day08;		//Ŭ���̾�Ʈ ���Ӱ��� �ʿ��ϴ�.SimpleServer Ŭ����

import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SocketTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Socket socket = new Socket("localhost", 8888);
		System.out.println("������ ���� �����߽��ϴ�.");
		
		//�߰��� �κ�.
		InputStream in = socket.getInputStream();
		byte[] buff = new byte[20];		//Ŭ���̾�Ʈ���� ����Ʈ20������ �����͸� �д´�. �׷��� "�ȳ��ϼ���!!!"�� ���´�.
		in.read(buff);
		
		System.out.println(new String(buff));
		
		in.close();
		socket.close();
		
	}

}
