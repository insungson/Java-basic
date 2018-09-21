package day06;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.addElement("����");
		v.addElement("����Ŭ");
		v.addElement("�����");

		int count = v.size();

		for (int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
					//���� �����ö� Ŭ�������� �����Ǵ°��� �ְ� �ȵǴ°͵��� �ִ�... vector�� ��� Enumeration,Iterator �Ѵ� �����Ǵ� ���̴�.
					
		System.out.println("********************************");
		Enumeration<String> e = v.elements();		//vector ���� elements�� �� ����ְ� �̰� Enumeration<String>�� ���� ���� �����´�.
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		System.out.println("******************************");
		Iterator<String> it = v.iterator();			//vector ���� iterator�� �� ����ְ� �̰� Iterator<String>�� ���� ���� �����´�.
		while (it.hasNext()) {
			String s = it.next();	//generic�� ���� ���� ���� object���·� ���� ������ ()�� ��������ȯ�� �ؼ� ���� �־���Ѵ�.
			System.out.println(s);
		}

	}

}
