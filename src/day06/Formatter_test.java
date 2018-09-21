package day06;

import java.util.Formatter;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Formatter_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =  new StringBuffer(); 
		Formatter f = new Formatter( sb ); 
		String name = "안대혁"; 
		int score = 100; 
		
		f.format(  "%s님의 점수는 %d 입니다.", name, score );
		System.out.println(f.toString());
		
		String s = String.format("%s님의 점수는 %d 입니다.", name, score );
		System.out.println(s);
	}

}
