package day07;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String host = "www.nver.com";

			InetAddress inetAddress[] = InetAddress.getAllByName(host);
			for (InetAddress inetAddress1 : inetAddress) {
				System.out.println(inetAddress1.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println("주소를 찾을 수 없습니다");
		}

	}

}
