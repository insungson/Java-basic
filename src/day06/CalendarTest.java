package day06;

import java.util.Calendar; //log ����� �������ؼ� ���δ�...

public class CalendarTest {

	public static void printDate(Calendar caledar) {
		System.out.println(caledar.get(Calendar.YEAR) + " �� " + (caledar.get(Calendar.MONTH) + 1) + "��" + // 0 ���� ������
				caledar.get(Calendar.DATE) + " �� " + (caledar.get(Calendar.AM_PM) == 0 ? " ���� " : " ���� ") + // ���� :0, ����
																											// :1
				caledar.get(Calendar.HOUR) + " �� " + caledar.get(Calendar.MINUTE) + " �� " + caledar.get(Calendar.SECOND)
				+ " �� ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar caledar = Calendar.getInstance();
		// ����
		printDate(caledar);
		// �⵵�� 2016������ ����
		caledar.set(Calendar.YEAR, 2016);
		printDate(caledar);
		caledar.set(2016, 2, 12);
		printDate(caledar);
		caledar.set(2016, 2, 12, 13, 59);
		printDate(caledar);
		caledar.set(2016, 6, 12, 13, 59, 30);
		printDate(caledar);

		System.out.println("******************************");
		// ����
		caledar = Calendar.getInstance();
		printDate(caledar);
		// 100�� ��
		caledar.add(Calendar.DATE, 100);
		printDate(caledar);
		// �ٽ� ����
		caledar = Calendar.getInstance();
		printDate(caledar);
		// 10����
		caledar.add(Calendar.MONTH, -10);
		printDate(caledar);
		// �ٽ� ����
		caledar = Calendar.getInstance();
		printDate(caledar);
		// ������ ���� �� ��° �Ǵ³�?
		System.out.println(" ������ ���� " + caledar.get(Calendar.DAY_OF_YEAR) + " ��° �Ǵ� ���Դϴ� .");

	}

}
