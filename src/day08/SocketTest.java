package day08;		//클라이언트 접속관련 필요하다.SimpleServer 클래스

import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SocketTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Socket socket = new Socket("localhost", 8888);
		System.out.println("서버에 연결 성공했습니다.");
		
		//추가한 부분.
		InputStream in = socket.getInputStream();
		byte[] buff = new byte[20];		//클라이언트에서 바이트20단위로 데이터를 읽는다. 그래서 "안녕하세요!!!"가 나온다.
		in.read(buff);
		
		System.out.println(new String(buff));
		
		in.close();
		socket.close();
		
	}

}
