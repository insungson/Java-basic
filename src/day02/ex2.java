package day01; //p55 �ǽ�

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner stdin = new Scanner(System.in);
//System.out.print("�Ҽ����� �Ǵ��� ���� :");
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
//	System.out.println(num+"�� �Ҽ��Դϴ�.");
//}else {
//	System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
//}

//Scanner stdin = new Scanner(System.in);
//System.out.print("�Ҽ����� �Ǵ��� ���� :");
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
//	System.out.println(num+"�� �Ҽ��Դϴ�.");
//}else {
//	System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
//}

//int figure=0;
//while(divisor<num) {
//	figure = num%divisor;
//	divisor++;
//	if(figure == 0) {
//		System.out.println("�Է��� ���� : "+num+"�� �Ҽ��� �ƴմϴ�..");
//		break;
//	}else {
//		System.out.println("�Է��Ѽ��ڴ� : "+num+"�� �Ҽ��Դϴ�..");
//		break;
//	}	
//	
//
//}

//https://dmlgus103.blog.me/221323132572	�˰���

		Scanner in = new Scanner(System.in);
		System.out.print("plz... input a number :");
		int a = in.nextInt();
		int i = a - 1;
		int j = 2;

		while (true) {
			if (j <= i) {
				if (a % j == 0) {
					System.out.println("�Ҽ� x");
					break;
				} else
					j++;
			} else {
				System.out.println("�Ҽ� ��");
				break;
			}
		}

	}

}
