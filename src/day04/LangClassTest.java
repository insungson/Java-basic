package day04;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2, 3);
											//아래의 매소드들은 object에 들어있는 것들이다.
//		System.out.println(p.getClass().getName());
//		System.out.println(p.hashCode()); // 객체를 유일하게 구분할 수 있는 정수 id
//		System.out.println(p.toString());		//메모리값이다.		tostring 매소드를 재정의 하고 나면 값을 설정으로 바꿀수 있다.
//		System.out.println(p);					//메모리값이다.		여기 값도 위와 같이 나온다.
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		System.out.println( a );
		System.out.println( b );
		System.out.println( a == b );
		System.out.println( a.equals( b ) );
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println( s1 == s2 );
		System.out.println( s1.equals( s2 ) );
		Integer i1 = new Integer(2);
		Integer i2 = new Integer(2);
		System.out.println(i1.equals(i2));
	}

}
