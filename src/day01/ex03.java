package day01;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b;
		int i = 414;
		double f = 123.456;
		
		//데이터가 큰 -> 작은데로 간다.
		b =(byte)i;
		System.out.println("int 414를 byte로 변환 : " + b);
		i = (int)f;
		System.out.println("float 123.456을 int로 변환: "+i);
		b=(byte)f;
		System.out.println("float 123.456을 byte로 변환: "+b);
	}

}
