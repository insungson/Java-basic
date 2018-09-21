package day01; //p55 실습

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner stdin = new Scanner(System.in);
//System.out.print("소수인지 판단할 숫자 :");
//
//int divisor =2;
//int num = stdin.nextInt();
//boolean isPrime = true;
//
//while(divisor<num&&isPrime) {
//	isPrime = (num%divisor) !=0;
//	divisor ++;
//}
//if(isPrime) {
//	System.out.println(num+"은 소수입니다.");
//}else {
//	System.out.println(num+"은 소수가 아닙니다.");
//}

//Scanner stdin = new Scanner(System.in);
//System.out.print("소수인지 판단할 숫자 :");
//
//int divisor = 2;
//int num = stdin.nextInt();
//boolean isPrime = true;
//
//while(num > divisor) {
//	if((num%divisor) == 0) {
//		isPrime = false;
//		break;
//	}
//	divisor ++;
//}
//if(isPrime) {
//	System.out.println(num+"은 소수입니다.");
//}else {
//	System.out.println(num+"은 소수가 아닙니다.");
//}

//int figure=0;
//while(divisor<num) {
//	figure = num%divisor;
//	divisor++;
//	if(figure == 0) {
//		System.out.println("입력한 수는 : "+num+"로 소수가 아닙니다..");
//		break;
//	}else {
//		System.out.println("입력한숫자는 : "+num+"로 소수입니다..");
//		break;
//	}	
//	
//
//}

//https://dmlgus103.blog.me/221323132572	알고리즘

		Scanner in = new Scanner(System.in);
		System.out.print("plz... input a number :");
		int a = in.nextInt();
		int i = a - 1;
		int j = 2;

		while (true) {
			if (j <= i) {
				if (a % j == 0) {
					System.out.println("소수 x");
					break;
				} else
					j++;
			} else {
				System.out.println("소수 ㅇ");
				break;
			}
		}

	}

}
