package day01; //p68 ��ǥ���� ��ȭ

import java.util.*;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://blog.naver.com/jpjpjp98/221117827997
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڿ� ����� �ۼ��Ͻÿ� >>");

		int row = scanner.nextInt();
		int method = scanner.nextInt();

		if (method == 1) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else if (method == 2) {
			for (int i = 0; i < row; i++) {
				for (int j = row; i <= j; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else if (method == 3) {								// �� �ȵǴ��� ���ذ� �Ȱ�.......................
			for (int i = 1; i <= row; i++) {
				for (int j = i; j <= (row-1); j++) {
					System.out.print(" ");
				}
				for (int k = i; k < 3*i-1; k++) {
					System.out.print("*");
				}
				//for (int l = i; l < (row-1); l++) {
				//	System.out.print(" ");
				//}
				System.out.println();
			}
		}

	}

}
