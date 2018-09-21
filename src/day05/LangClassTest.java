package day05; //11p 문제

import com.sun.javafx.font.directwrite.RECT;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);

		if (a.equals(b))
			System.out.println("a.equals(b) :" + a.equals(b));
		if (a.equals(c))
			System.out.println("a.equals(c) :" + a.equals(c));
		if (b.equals(c))
			System.out.println("b.equals(c) :" + b.equals(c));	
		
		System.out.println( a.getClass().getName() );
		System.out.println( a.hashCode() );  // 객체를 유일하게 구분할 수 있는 정수 id   
		System.out.println( a.toString() );  
		System.out.println( a );
		
		
	}

}
