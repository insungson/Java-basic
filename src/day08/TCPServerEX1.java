package day08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServerEX1 {

	private static final int SERVER_PORT = 8888;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		ServerSocket serverSocket = null;
		OutputStream outputStream = null;
		InputStream inputStream = null;
		try {
			serverSocket = new ServerSocket();
			
//			InetAddress inetAddress = InetAddress.getLocalHost();						//�̰� �ᵵ �Ǵµ�... ���⼭�� �Ⱦ���.
//			String localhostaddress = inetAddress.getHostAddress();
//			serverSocket.bind(new InetSocketAddress(localhostaddress, SERVER_PORT));
			
			serverSocket.bind(new InetSocketAddress("localhost",SERVER_PORT));
			System.out.println("[����] ���� ��ٸ�");
			socket = serverSocket.accept();			//accept�� ���ϰ��� socket�̴�.
			System.out.println("[����]�����");
			
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				//Returns the address of the endpoint this socket is connected to, or null if it is unconnected
			System.out.println("[Server] ����� from "+ inetSocketAddress.getHostName()+" : "
					+ inetSocketAddress.getPort());
			
			//cmdâ���� �Է��Ѱ��� ������ �ܼ�â�� �߰� �Ѵ�.(Ŭ���̾�Ʈ���� �Է��Ѱ��� ������ ������. -> �������� �д´� -> while������ �������� �ʰ� ��� ������.
			inputStream = socket.getInputStream();		
			outputStream = socket.getOutputStream();
			while(true) {
				byte[] buffer = new byte[256];
				int readBytecount = inputStream.read(buffer);	//�������� �о�ɴϴ�.
				if(readBytecount<0){
					System.out.println("[Server] Ŭ���̾�Ʈ�� ������ ���������ϴ�.!!");
					break;
				}
				
				String data = new String(buffer,0,readBytecount,"UTF-8");	//�̰� �������� �ϸ� Ŭ���̾�Ʈ������ �ؾ��Ѵ�. ���ϸ� �Ѵ� ���ؾ��Ѵ�.
				System.out.println(data);
				
				
				//Ŭ���̾�Ʈ�� ������ �����Ѵ�.
				outputStream.write(("["+data+"]").getBytes("UTF-8"));	//�б� ���� �Ѵ�  UTF-8 �� �����ؾ� �ȴ�. �Ѵ� ���ϴ��� �Ѵ� �ؾ��Ѵ�.
				outputStream.flush();
			}//End of While
			
			

		}catch(SocketException e2) {
			System.out.println("[server] closed by client");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null && serverSocket.isClosed() == false) {
				try {
					if(socket != null) socket.close();
					if(serverSocket != null) serverSocket.close();
					if(outputStream != null) outputStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
