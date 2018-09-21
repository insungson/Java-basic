package day07; //p32번 문제 풀기

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = null;

		try {
			while (true) {
				System.out.print(">>>");
				scanner = new Scanner(System.in); // 입력값을 받는 역확을 한다.((buffer로 해도 되는데 책에선ㄴ scanner를 추천했다...))
				String host = scanner.nextLine(); // 위의 입력값 한줄을 읽는 역활을 한다.

				if (host.equals("exit"))
					break;

				InetAddress inetAddress[] = InetAddress.getAllByName(host); // 주소값을 배열로 리턴을 한다.
				for (InetAddress inetAddress1 : inetAddress) { // 배열의 인스턴스 중 하나의 변수를 뽑는다.
					System.out.println(host + " : " + inetAddress1.getHostAddress()); // 배열 중 하나의 ip주소를 찍는다. for문이기 때문에
																						// 배열의 모든 변수들을 찍는다.
				}
				
//				for(int i =0 ; i<inetAddress.length;i++) {
//					System.out.println(host + " : " + inetAddress[i].getHostAddress());	//위와 같은 방식의 배열을 풀어내는 것이다.
//				}
				
			}

		} catch (UnknownHostException e) {
			System.out.println("주소를 찾을 수 없습니다");
		}

	}
}