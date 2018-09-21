package day08practice;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("서버 준비 중");
		
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 연결됨");
		
		byte[] arr = "안녕하세요!!!".getBytes();
		OutputStream out = socket.getOutputStream();
		out.write(arr);
		out.flush();//Flushes this output stream and forces any buffered output bytesto be written out
		System.out.println("클라이언트로 전송완료");
		out.close();
		socket.close();
		serverSocket.close();
	}

}
