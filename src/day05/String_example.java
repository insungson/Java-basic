package day05;

public class String_example {

	public static void main(String[] args) {
	
		String a = new String(" abcd");
		String b = new String(",efg ");
		// 문자열 연결
		a = a.concat(b);
		System.out.println(a);
		// 공백제거
		a = a.trim();
		System.out.println("---" + a + "---");
		// 문자열 대치
		a = a.replaceAll("ab", "12");
		System.out.println(a);
		// 문자열 분리
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		// 서브스트링 1개 입력시 1개 입력한 숫자 뒤를 다 잘라버림..
		a = a.substring(3);
		System.out.println(a);
		// 문자열의 문자
		char c = a.charAt(2);
		System.out.println(c);
	}

}
