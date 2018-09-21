package day07Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = null;
		
		try {
			while(true) {
				System.out.print(">>>");
				scanner = new Scanner(System.in);
				String host = scanner.nextLine();
				
				if(host.equals("exit"))
					break;
				
				InetAddress inetAddress[] = InetAddress.getAllByName(host);
				for(InetAddress inetAddress2 : inetAddress) {
					System.out.println(host+" : "+inetAddress2.getHostAddress());
				}
			}
			
		}catch(UnknownHostException e) {
			System.out.println("주소를 찾을 수 없습니다.");
		}
	}

}
