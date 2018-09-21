package day05;

public class String_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'A';				//letter을 캐릭터로 선언
		System.out.println(letter);		//그냥 A가 나옴
		System.out.println((int)letter);//정수로 바꾸면 65가 나옴..		2바이트(char) -> 4바이트(int) 이므로 강제형변환(int)를 해줘야한다.

		System.out.println("XXXXXXXXXXX");
		
		System.out.println("Hello \"JAVA!\"");	//\는 문자열을 보이게 해준다.
		
		String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = s1;
		String s4 = "abcd";				//위에서 객체를 만들지 않고 메모리에 저장이 되기 때문에 다시 할당할때 새로운 메모리를 할당하는게 아니라 기존의 것을 사용한다.
										// 그래서 같은것이다.		
		System.out.println("(s1 ==s2)"+(s1 ==s2));
		System.out.println("(s1 ==s3)"+(s1 ==s3));
		System.out.println("(s1 ==s4)"+(s1 ==s4));				//true인데 
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		System.out.println("s1.equals(s4)"+s1.equals(s4));		
				//현업에선 equals가 쓰인다...!!
		
		String greeting = "hello JAVA!";
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(1,3));		//python 슬라이싱과 같은 것이다.
		
		String str1 = "hello java!";
		String str2 = str1.toUpperCase();
		String str4 = str2.concat("??");
		String str5 = "!".concat(str2).concat("@");
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str4:"+str4);
		System.out.println("str5:"+str5);
		
		String a = "aBcAbCabcABC"; //p20 문제 (API문서 보고 찾기)
		System.out.println(a.charAt(2));	//3번째 문자열 출력
		System.out.println(a.indexOf("abc"));	//"abc"문자열이 처음으로 나타나는 인덱스를 추적
		System.out.println(a.length());	//위 문자열의 문자 개수를 출력한다.
		System.out.println(a.replace('a','R'));	//'a' ->'R'
		System.out.println(a.replaceAll("abc","123"));	//"abc" ->"123" 
		System.out.println(a.substring(0,3));		//처음 3개의 문자열을 출력한다.
		System.out.println(a.toUpperCase());		//문자열을 모두 대문자로 변경
		System.out.println(a.toLowerCase());		//문자열을 모두 소문자로 변경
		
		
	}

}
