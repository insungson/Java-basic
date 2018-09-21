package day06;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest {			//log기록을 보기위해 쓰인다.
	
	
	public static void printDate(Date d) {					//실무에서 많이 쓰임...
		String pattern = "yyyy년 MM월 dd일  E요일 HH:MM:ss" ;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern)  ;
		System.out.println(sdf.format(d));;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date now = new Date();
System.out.println(now.toString());
System.out.println(now.toLocaleString());
		

System.out.println("****DateFormat 클래스 이용 *****");
DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println(dateFormat1.format(now));
DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
System.out.println(dateFormat2.format(now));
DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
System.out.println(dateFormat3.format(now));
DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT);
System.out.println(dateFormat4.format(now));

printDate(now);
	}

}
