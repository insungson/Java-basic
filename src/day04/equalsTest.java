package day04;

public class equalsTest {
	public static void main(String[] args) {
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		System.out.println("a.equals(b) :"+a.equals(b)); //����
		System.out.println("a == b :"+(a == b));		 //�ּҺ�
		System.out.println("a == c :"+(a == c));		 //�ּҺ�
		System.out.println("a.equals(c) :"+a.equals(c)); //����
	}
}
