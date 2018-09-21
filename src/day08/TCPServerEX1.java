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
			
//			InetAddress inetAddress = InetAddress.getLocalHost();						//이걸 써도 되는데... 여기서는 안쓴다.
//			String localhostaddress = inetAddress.getHostAddress();
//			serverSocket.bind(new InetSocketAddress(localhostaddress, SERVER_PORT));
			
			serverSocket.bind(new InetSocketAddress("localhost",SERVER_PORT));
			System.out.println("[서버] 연결 기다림");
			socket = serverSocket.accept();			//accept의 리턴값은 socket이다.
			System.out.println("[서버]연결됨");
			
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				//Returns the address of the endpoint this socket is connected to, or null if it is unconnected
			System.out.println("[Server] 연결됨 from "+ inetSocketAddress.getHostName()+" : "
					+ inetSocketAddress.getPort());
			
			//cmd창에서 입력한것을 서버의 콘솔창에 뜨게 한다.(클라이언트에서 입력한것을 서버로 보낸다. -> 서버에서 읽는다 -> while문으로 종료하지 않고 계속 돌린다.
			inputStream = socket.getInputStream();		
			outputStream = socket.getOutputStream();
			while(true) {
				byte[] buffer = new byte[256];
				int readBytecount = inputStream.read(buffer);	//데이터을 읽어옵니다.
				if(readBytecount<0){
					System.out.println("[Server] 클라이언트와 연결이 끊어졌습니다.!!");
					break;
				}
				
				String data = new String(buffer,0,readBytecount,"UTF-8");	//이걸 서버에서 하면 클라이언트에서도 해야한다. 안하면 둘다 안해야한다.
				System.out.println(data);
				
				
				//클라이언트에 정보를 전달한다.
				outputStream.write(("["+data+"]").getBytes("UTF-8"));	//읽기 쓰기 둘다  UTF-8 을 설정해야 된다. 둘다 안하던가 둘다 해야한다.
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
