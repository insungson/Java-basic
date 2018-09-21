package day01;
												//ctrl+shift+o 를 누르면 알아서 그것에 해당하는 모듈을 import 해준다.
import java.util.*; //scanner를 가져오는 것이다.

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // 콘솔에 값을 입력할 수 있다.
		System.out.print("정수입력 >>");
		int count = scanner.nextInt(); // 입력받은 첫번째 인자값을 정수로 받는다.
		int i = 0;
		while (i < count) {
			System.out.println("hello world");
			i += 1;
		}//end of while
		scanner.close();
	}//end of main

}
