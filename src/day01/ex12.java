package day01;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // 콘솔에 값을 입력할 수 있다.
		System.out.print("정수입력 >>");
		int count = scanner.nextInt(); // 입력받은 첫번째 인자값을 정수로 받는다.
		for (int i = 0; i < count; i++) {
			System.out.println("hello world");
		} // end of for
		scanner.close();
	}// end of main

}
