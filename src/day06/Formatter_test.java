package day06;

import java.util.Formatter;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Formatter_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =  new StringBuffer(); 
		Formatter f = new Formatter( sb ); 
		String name = "�ȴ���"; 
		int score = 100; 
		
		f.format(  "%s���� ������ %d �Դϴ�.", name, score );
		System.out.println(f.toString());
		
		String s = String.format("%s���� ������ %d �Դϴ�.", name, score );
		System.out.println(s);
	}

}
