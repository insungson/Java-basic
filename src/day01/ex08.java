package day01;
												//ctrl+shift+o �� ������ �˾Ƽ� �װͿ� �ش��ϴ� ����� import ���ش�.
import java.util.*; //scanner�� �������� ���̴�.

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // �ֿܼ� ���� �Է��� �� �ִ�.
		System.out.print("�����Է� >>");
		int count = scanner.nextInt(); // �Է¹��� ù��° ���ڰ��� ������ �޴´�.
		int i = 0;
		while (i < count) {
			System.out.println("hello world");
			i += 1;
		}//end of while
		scanner.close();
	}//end of main

}
