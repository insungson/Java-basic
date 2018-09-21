//p54 문제 풀이
package day01;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		System.out.print("승수 :");
		int pow = scanner.nextInt();
		int i = 0;
		while(i<pow) {
			result *= 2;
			i++;
		}
		System.out.println("2의 "+pow+"제곱근은 "+result+"입니다.");
	}

}
