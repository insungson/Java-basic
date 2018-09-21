package day05;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This"); // 생성
		System.out.println(sb);
		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);
		sb.insert(7, "my"); // 문자열 대치
		System.out.println(sb);
		sb.replace(8, 10, "your"); //
		System.out.println(sb);
		sb.setLength(5); // 버퍼크기조정
		System.out.println(sb);

	}

}
