//p54 ���� Ǯ��
package day01;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		System.out.print("�¼� :");
		int pow = scanner.nextInt();
		int i = 0;
		while(i<pow) {
			result *= 2;
			i++;
		}
		System.out.println("2�� "+pow+"�������� "+result+"�Դϴ�.");
	}

}
