package day05;

public class String_example {

	public static void main(String[] args) {
	
		String a = new String(" abcd");
		String b = new String(",efg ");
		// ���ڿ� ����
		a = a.concat(b);
		System.out.println(a);
		// ��������
		a = a.trim();
		System.out.println("---" + a + "---");
		// ���ڿ� ��ġ
		a = a.replaceAll("ab", "12");
		System.out.println(a);
		// ���ڿ� �и�
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		// ���꽺Ʈ�� 1�� �Է½� 1�� �Է��� ���� �ڸ� �� �߶����..
		a = a.substring(3);
		System.out.println(a);
		// ���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);
	}

}
