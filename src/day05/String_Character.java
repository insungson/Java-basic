package day05;

public class String_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'A';				//letter�� ĳ���ͷ� ����
		System.out.println(letter);		//�׳� A�� ����
		System.out.println((int)letter);//������ �ٲٸ� 65�� ����..		2����Ʈ(char) -> 4����Ʈ(int) �̹Ƿ� ��������ȯ(int)�� ������Ѵ�.

		System.out.println("XXXXXXXXXXX");
		
		System.out.println("Hello \"JAVA!\"");	//\�� ���ڿ��� ���̰� ���ش�.
		
		String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = s1;
		String s4 = "abcd";				//������ ��ü�� ������ �ʰ� �޸𸮿� ������ �Ǳ� ������ �ٽ� �Ҵ��Ҷ� ���ο� �޸𸮸� �Ҵ��ϴ°� �ƴ϶� ������ ���� ����Ѵ�.
										// �׷��� �������̴�.		
		System.out.println("(s1 ==s2)"+(s1 ==s2));
		System.out.println("(s1 ==s3)"+(s1 ==s3));
		System.out.println("(s1 ==s4)"+(s1 ==s4));				//true�ε� 
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		System.out.println("s1.equals(s4)"+s1.equals(s4));		
				//�������� equals�� ���δ�...!!
		
		String greeting = "hello JAVA!";
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(1,3));		//python �����̰̽� ���� ���̴�.
		
		String str1 = "hello java!";
		String str2 = str1.toUpperCase();
		String str4 = str2.concat("??");
		String str5 = "!".concat(str2).concat("@");
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str4:"+str4);
		System.out.println("str5:"+str5);
		
		String a = "aBcAbCabcABC"; //p20 ���� (API���� ���� ã��)
		System.out.println(a.charAt(2));	//3��° ���ڿ� ���
		System.out.println(a.indexOf("abc"));	//"abc"���ڿ��� ó������ ��Ÿ���� �ε����� ����
		System.out.println(a.length());	//�� ���ڿ��� ���� ������ ����Ѵ�.
		System.out.println(a.replace('a','R'));	//'a' ->'R'
		System.out.println(a.replaceAll("abc","123"));	//"abc" ->"123" 
		System.out.println(a.substring(0,3));		//ó�� 3���� ���ڿ��� ����Ѵ�.
		System.out.println(a.toUpperCase());		//���ڿ��� ��� �빮�ڷ� ����
		System.out.println(a.toLowerCase());		//���ڿ��� ��� �ҹ��ڷ� ����
		
		
	}

}
