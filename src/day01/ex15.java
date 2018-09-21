package day01;	//p60 합문제
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("plz... input a number :");
		int a = in.nextInt();
		int sum =0;
		for(int i=0;i<=a;i++) {
			sum +=i;
		}
		System.out.println(a+"수의 입력의 합은"+sum+"입니다.");
	}

}
