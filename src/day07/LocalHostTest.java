package day07;

import java.net.InetAddress;	//ip주소 관련된 것을 알려주는 패키지 이다.
import java.util.Arrays;

public class LocalHostTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress inetaddress = InetAddress.getLocalHost();
		System.out.println(inetaddress.getHostName());
		System.out.println(inetaddress.getHostAddress());
		System.out.println(Arrays.toString(inetaddress.getAddress()));	//byte로 바꿔서 앞의 비트가 바뀌어서 결과가 -로 나온다.
	}

}
