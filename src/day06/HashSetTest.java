package day06;

import java.util.HashSet;						//Point Ŭ������ �����...
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("Car");
		hs.add("Bus");
		hs.add("Truck");
		hs.add("Man");
		hs.add("Woman");
		hs.add("Child");
		System.out.println(hs.size());				//HashSet�� equl�� ������ ���� hashcode���� ���� ���Ѵ�... ���� ���� ��� �߰��� �ص� 
													//equals tostring ���� �����ϰ� hashcode�� �����ؾ��Ѵ�.
		if (hs.contains("Man")) {
			hs.remove("Man");
		}
		
		
	//	hs.add("Car");		//�ߺ��� �����ϱ� ������ �̰� �߰��ص� ����� �״���̴�.
		
		if (hs.contains("Car")) {
			hs.add("Car2");
		}
		
		Point p1 = new Point(2,3);
		hs.add(p1);
		System.out.println(hs.size());
		System.out.println(hs);		
		
		//HashSet�� equal�� ������ ���� hashcode���� ���� ���Ѵ�... ���� ���� ��� set���� �߰��ص� �׳� �þ ���̴�.
		//equals tostring ���� �����ϰ� hashcode ���μ����ؼ� ����� ���� ���� �߰��� �ȵȴ�.
		//[Bus, Car2, Point(2,3), Point(2,3), Car, Truck, Woman, Child]  pointŬ�������� hashcode�� �߰����� ������ �̷��� ���.
		//[Bus, Car2, Point(2,3), Car, Truck, Woman, Child]	pointŬ�������� hashcode�� �߰��ϸ� �̷��� ���.
		
		Point p2 = new Point(2,3);
		hs.add(p2);
		System.out.println(hs.size());
		System.out.println(hs);
		
		System.out.println(hs);                                                                                  
		           
		
//		Iterator it = hs.iterator();	//Iterator �� �����͸� �����´�.
//		while(it.hasNext()) {
//			String s = (String)it.next();
//			System.out.println(s);
//		}
		
	}

}
