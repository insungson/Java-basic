package day08;			//server를 켜기 위해서 필요하다. SocketTest클래스

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("서버 준비 중");
		
		Socket socket = serverSocket.accept();// 대기중 클라이언트 연결 시 소켓 리턴
		System.out.println("클라이언트 연결됨");
		
		byte[] arr = "안녕하세요!!!".getBytes();		//안녕하세요를 바이트 형태의 배열에 넣는다
		OutputStream out = socket.getOutputStream();//outputstream으로 데이터를 쓴다.(보낸다.)
		out.write(arr);								//이걸 여기에 입력한다. 
		out.flush();
		System.out.println("클라이언트로 데이터 전송완료");
		out.close();
		socket.close();
		serverSocket.close();
		
	}

}
