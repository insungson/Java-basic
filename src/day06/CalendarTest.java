package day06;

import java.util.Calendar; //log 기록을 보기위해서 쓰인다...

public class CalendarTest {

	public static void printDate(Calendar caledar) {
		System.out.println(caledar.get(Calendar.YEAR) + " 년 " + (caledar.get(Calendar.MONTH) + 1) + "월" + // 0 부터 시작함
				caledar.get(Calendar.DATE) + " 일 " + (caledar.get(Calendar.AM_PM) == 0 ? " 오전 " : " 오후 ") + // 오전 :0, 오후
																											// :1
				caledar.get(Calendar.HOUR) + " 시 " + caledar.get(Calendar.MINUTE) + " 분 " + caledar.get(Calendar.SECOND)
				+ " 초 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar caledar = Calendar.getInstance();
		// 지금
		printDate(caledar);
		// 년도를 2016년으로 설정
		caledar.set(Calendar.YEAR, 2016);
		printDate(caledar);
		caledar.set(2016, 2, 12);
		printDate(caledar);
		caledar.set(2016, 2, 12, 13, 59);
		printDate(caledar);
		caledar.set(2016, 6, 12, 13, 59, 30);
		printDate(caledar);

		System.out.println("******************************");
		// 오늘
		caledar = Calendar.getInstance();
		printDate(caledar);
		// 100일 후
		caledar.add(Calendar.DATE, 100);
		printDate(caledar);
		// 다시 오늘
		caledar = Calendar.getInstance();
		printDate(caledar);
		// 10달전
		caledar.add(Calendar.MONTH, -10);
		printDate(caledar);
		// 다시 오늘
		caledar = Calendar.getInstance();
		printDate(caledar);
		// 오늘은 올해 몇 일째 되는날?
		System.out.println(" 오늘은 올해 " + caledar.get(Calendar.DAY_OF_YEAR) + " 일째 되는 날입니다 .");

	}

}
