package day04;

public class equalsTest {
	public static void main(String[] args) {
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		System.out.println("a.equals(b) :"+a.equals(b)); //값비교
		System.out.println("a == b :"+(a == b));		 //주소비교
		System.out.println("a == c :"+(a == c));		 //주소비교
		System.out.println("a.equals(c) :"+a.equals(c)); //값비교
	}
}
