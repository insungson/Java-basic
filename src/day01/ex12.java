package day01;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // �ֿܼ� ���� �Է��� �� �ִ�.
		System.out.print("�����Է� >>");
		int count = scanner.nextInt(); // �Է¹��� ù��° ���ڰ��� ������ �޴´�.
		for (int i = 0; i < count; i++) {
			System.out.println("hello world");
		} // end of for
		scanner.close();
	}// end of main

}
