package day04;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2, 3);
											//�Ʒ��� �żҵ���� object�� ����ִ� �͵��̴�.
//		System.out.println(p.getClass().getName());
//		System.out.println(p.hashCode()); // ��ü�� �����ϰ� ������ �� �ִ� ���� id
//		System.out.println(p.toString());		//�޸𸮰��̴�.		tostring �żҵ带 ������ �ϰ� ���� ���� �������� �ٲܼ� �ִ�.
//		System.out.println(p);					//�޸𸮰��̴�.		���� ���� ���� ���� ���´�.
		
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
