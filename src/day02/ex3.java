package day01;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("plz... input a number :");
		int a = in.nextInt();
		int sum =0;
		for(int i=0;i<=a;i++) {
			sum +=i;
		}
		System.out.println(a+"���� �Է��� ����"+sum+"�Դϴ�.");
	}

}