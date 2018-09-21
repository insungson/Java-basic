package day06;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Vector> ht = new Hashtable<String, Vector>();	//generic���� ������Ÿ���� �����ϸ� ���߿� ��½� ����ȯ�� �� �ʿ䰡 ����.
		Vector v1 = new Vector(); 
		Vector v2 = new Vector();
		v1.add("Taxi"); v1.add("Bus"); v1.add("Truck"); 
		v2.add("Man"); v2.add("Woman"); v2.add("Child");
		ht.put("Car",v1);
		ht.put("Person",v2); 
	//	ht.put("name", "ȫ�浿");	//������ generic���� ���¸� vector�� ���߱� ������ String���� ������ ������ �߻��Ѵ�.
		
		System.out.println(ht.get("Car"));
		if( ht.containsKey("Person") ) { 			//�̰� key�� �ִ��� ������ Ȯ���ϴ� �ż���
			System.out.println(ht.get("Person")); 
		}else {
			System.out.println("There isn't KEY you're looking for");
		}

		System.out.println(ht.contains(v1));		//�̰� value�� �ִ��� ������ Ȯ���ϴ� �ż���
		//Ű ���� ���� �콬���̺��� �����Ͱ� ��� ��������
		
		Enumeration ekey = ht.keys();
		while(ekey.hasMoreElements()) {
			String key = (String)ekey.nextElement();
			System.out.println(key+":"+ht.get(key));
		}
		
	}

}
