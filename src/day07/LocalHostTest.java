package day07;

import java.net.InetAddress;	//ip�ּ� ���õ� ���� �˷��ִ� ��Ű�� �̴�.
import java.util.Arrays;

public class LocalHostTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress inetaddress = InetAddress.getLocalHost();
		System.out.println(inetaddress.getHostName());
		System.out.println(inetaddress.getHostAddress());
		System.out.println(Arrays.toString(inetaddress.getAddress()));	//byte�� �ٲ㼭 ���� ��Ʈ�� �ٲ� ����� -�� ���´�.
	}

}
