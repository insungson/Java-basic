package day05;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This"); // ����
		System.out.println(sb);
		sb.append(" is pencil"); // ���ڿ� �����̱�
		System.out.println(sb);
		sb.insert(7, "my"); // ���ڿ� ��ġ
		System.out.println(sb);
		sb.replace(8, 10, "your"); //
		System.out.println(sb);
		sb.setLength(5); // ����ũ������
		System.out.println(sb);

	}

}
