package day07; //p32�� ���� Ǯ��

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
				scanner = new Scanner(System.in); // �Է°��� �޴� ��Ȯ�� �Ѵ�.((buffer�� �ص� �Ǵµ� å������ scanner�� ��õ�ߴ�...))
				String host = scanner.nextLine(); // ���� �Է°� ������ �д� ��Ȱ�� �Ѵ�.

				if (host.equals("exit"))
					break;

				InetAddress inetAddress[] = InetAddress.getAllByName(host); // �ּҰ��� �迭�� ������ �Ѵ�.
				for (InetAddress inetAddress1 : inetAddress) { // �迭�� �ν��Ͻ� �� �ϳ��� ������ �̴´�.
					System.out.println(host + " : " + inetAddress1.getHostAddress()); // �迭 �� �ϳ��� ip�ּҸ� ��´�. for���̱� ������
																						// �迭�� ��� �������� ��´�.
				}
				
//				for(int i =0 ; i<inetAddress.length;i++) {
//					System.out.println(host + " : " + inetAddress[i].getHostAddress());	//���� ���� ����� �迭�� Ǯ��� ���̴�.
//				}
				
			}

		} catch (UnknownHostException e) {
			System.out.println("�ּҸ� ã�� �� �����ϴ�");
		}

	}
}