package day06;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hashtable<String, Integer>
		 * 
		 * "�Ѹ�" : 10 "��浿" : 20 "�浿��" : 30 "��ġ" : 40 "������" : 50
		 * 
		 * �ش絥���͸� �ؽ����̺� �Է� �� �����Ϳ� ���� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("�Ѹ�", 10);
		ht.put("��浿", 20);
		ht.put("�浿��", 30);
		ht.put("��ġ", 40);
		ht.put("������", 50);

		System.out.println(ht.get("�Ѹ�"));
		Enumeration ekey = ht.keys();
		int calaverage=0;
		while (ekey.hasMoreElements()) {
			String key = (String)ekey.nextElement();
			calaverage += ht.get(key);
			System.out.println(key + ":" + ht.get(key));
		}
		System.out.println("��ĳ���͵��� ��հ��� : "+(calaverage/ht.size()));
		
		Enumeration<Integer> en = ht.elements();
		int sum = 0;
		int count = ht.size();
		
		while(en.hasMoreElements()) {
			int value = en.nextElement();
			System.out.println("value : " + value);
			sum += value;
		}
		System.out.println("��� : "+ sum/count);
		
	}
}
