package day08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {

private static final int SERVER_PORT = 8888;
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//1. ���� ���� ����
			serverSocket = new ServerSocket();
			
			//2. ���ε�( binding )  IP�� ��Ʈ ��ȣ ����.
			/***
			InetAddress inetAddress = InetAddress.getLocalHost();
			String localhostAddress = inetAddress.getHostAddress();
			***/
			String localhostAddress = "localhost" ;
			serverSocket.bind( new InetSocketAddress(localhostAddress, SERVER_PORT ) );
			
			System.out.println( "[server] binding "  + localhostAddress + ":" +  SERVER_PORT );
			//3. accept(���� ��û�� ��ٸ�)
			Socket socket = serverSocket.accept();   // blocking
			
			//4 ���� ���� (���ӵ� Ŭ���̾�Ʈ�� ������ �����´�.)
			InetSocketAddress remoteAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			int remoteHostPort = remoteAddress.getPort();
			String remoteHostAddress = remoteAddress.getAddress().getHostAddress();
			System.out.println( "[server] connected from " + remoteHostAddress + ":" + remoteHostPort );
			
			
			InputStream is = null ; 
			OutputStream os = null ;		
			try {
				//5. IOStream �޾ƿ���
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				while( true ) {
					//6. ������ �б�
					byte[] buffer = new byte[256];
					int readByteCount = is.read( buffer ); //blocking  //Client ���α׷��� ������ ���� �ȵ�.
					if( readByteCount <0 ) {
						// Ŭ���̾�Ʈ�� ������ ���� ���
						System.out.println( "[server] disconnected by client" );
						break;
					}
					//System.out.println(Arrays.toString(buffer) + "/" + readByteCount);
					
					//������ ������ ó������ �о�� ����Ʈ ũ�⸸ŭ �����ͷ� �����Ѵ�.
					String data = new String( buffer, 0, readByteCount, "utf-8" );
					//String data = "Hello World  ��ο���";
					
					System.out.println( "[server] received : " + data );
					
					//7. ������ ����(Ŭ���̾�Ʈ ���Ͽ� ������ ����)
					os.write( data.getBytes( "utf-8" ) );
					//os.write( data.getBytes( "EUC-KR" ) );
					os.flush();
				}//End Of While
			} catch( SocketException e ) {
				// Ŭ���̾�Ʈ�� ������ ���������� ���� �ʰ� ������ ���
				System.out.println( "[server] closed by client" );
			} catch( IOException e ) {
				e.printStackTrace();
			} finally {
				try {
					if( socket != null && socket.isClosed() == false ) {
						socket.close();
						
					if(os != null) os.close();
					if(is != null) is.close();
						
						
					}
				} catch( IOException e ) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//�ڿ�����
				if( serverSocket != null && serverSocket.isClosed() == false ){
					serverSocket.close();
				}
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
	}

	
}
