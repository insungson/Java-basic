package day01; //�ǽ�1������ p48

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 question answer
		int n1 = 10;
		int n2 = 30;
		int q1 = 0;
		if (n1 - n2 > 0) {
			System.out.println("n1:" + n1);
			System.out.println("n1:" + n2);
		} else {
			q1 = n1;
			n1 = n2;
			n2 = q1;
			System.out.println("n1:" + n1);
			System.out.println("n1:" + n2);
		}
		// �ִ밪�� �Ǻ��ϴ� ������ �ϼ��Ͻÿ�
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		if (a1 >= a2) {
			if (a1 > a3) {
				System.out.println("�ִ밪��" + a1 + "�Դϴ�.");
			} else {
				System.out.println("�ִ밪��" + a3 + "�Դϴ�.");
			}
		} else {
			if (a2 > a3) {
				System.out.println("�ִ밪��" + a2 + "�Դϴ�.");
			} else {
				System.out.println("�ִ밪��" + a3 + "�Դϴ�.");
			}
		}

	}

}
