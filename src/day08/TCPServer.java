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
			//1. 서버 소켓 생성
			serverSocket = new ServerSocket();
			
			//2. 바인딩( binding )  IP와 포트 번호 전달.
			/***
			InetAddress inetAddress = InetAddress.getLocalHost();
			String localhostAddress = inetAddress.getHostAddress();
			***/
			String localhostAddress = "localhost" ;
			serverSocket.bind( new InetSocketAddress(localhostAddress, SERVER_PORT ) );
			
			System.out.println( "[server] binding "  + localhostAddress + ":" +  SERVER_PORT );
			//3. accept(연결 요청을 기다림)
			Socket socket = serverSocket.accept();   // blocking
			
			//4 연결 성공 (접속된 클라이언트의 정보를 가져온다.)
			InetSocketAddress remoteAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			int remoteHostPort = remoteAddress.getPort();
			String remoteHostAddress = remoteAddress.getAddress().getHostAddress();
			System.out.println( "[server] connected from " + remoteHostAddress + ":" + remoteHostPort );
			
			
			InputStream is = null ; 
			OutputStream os = null ;		
			try {
				//5. IOStream 받아오기
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				while( true ) {
					//6. 데이터 읽기
					byte[] buffer = new byte[256];
					int readByteCount = is.read( buffer ); //blocking  //Client 프로그램이 죽으면 진행 안됨.
					if( readByteCount <0 ) {
						// 클라이언트가 소켓을 닫은 경우
						System.out.println( "[server] disconnected by client" );
						break;
					}
					//System.out.println(Arrays.toString(buffer) + "/" + readByteCount);
					
					//버퍼의 내용을 처음부터 읽어온 바이트 크기만큼 데이터로 변경한다.
					String data = new String( buffer, 0, readByteCount, "utf-8" );
					//String data = "Hello World  헬로월드";
					
					System.out.println( "[server] received : " + data );
					
					//7. 데이터 쓰기(클라이언트 소켓에 데이터 쓰기)
					os.write( data.getBytes( "utf-8" ) );
					//os.write( data.getBytes( "EUC-KR" ) );
					os.flush();
				}//End Of While
			} catch( SocketException e ) {
				// 클라이언트가 소켓을 정상적으로 닫지 않고 종료한 경우
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
				//자원정리
				if( serverSocket != null && serverSocket.isClosed() == false ){
					serverSocket.close();
				}
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
	}

	
}
