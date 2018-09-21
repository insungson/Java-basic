package day08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {

	private static final String SERVER_IP = "localhost";
	private static final int SERVER_PORT = 8888;
	
	public static void main(String[] args) {
		Socket socket = null;
		
		try { 
			//1.  Socket 생성
			socket = new Socket();
			
			//2. 서버 연결
			socket.connect( new InetSocketAddress( SERVER_IP, SERVER_PORT ) );

			//3. IOStream 받아오기(input,output)
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//4. 쓰기 / 읽기
			String data = "hello\n";
			//서버에 데이터 쓰기.
			os.write( data.getBytes( "utf-8" ) );
			
			byte[] buffer = new byte[256];
			int readCountByte = is.read( buffer );
			if( readCountByte <= -1 ){
				System.out.println( "[client] dusconnected by server" );
				return;
			}
			
			data = new String( buffer, 0, readCountByte, "utf-8" );
			System.out.println( "[client] received : "  + data );
			
		} catch( IOException e  ){
			e.printStackTrace();
		} finally {
			try {
				if( socket != null && socket.isClosed() == false ) {
					socket.close();
				}
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
	}

	
}
