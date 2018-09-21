package day06;

import java.util.HashSet;						//Point 클래스와 연결됨...
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
		System.out.println(hs.size());				//HashSet은 equl로 나오는 값과 hashcode값을 전부 비교한다... 전부 같을 경우 추가로 해도 
													//equals tostring 값을 설정하고 hashcode를 설정해야한다.
		if (hs.contains("Man")) {
			hs.remove("Man");
		}
		
		
	//	hs.add("Car");		//중복을 제거하기 때문에 이걸 추가해도 결과는 그대로이다.
		
		if (hs.contains("Car")) {
			hs.add("Car2");
		}
		
		Point p1 = new Point(2,3);
		hs.add(p1);
		System.out.println(hs.size());
		System.out.println(hs);		
		
		//HashSet은 equal로 나오는 값과 hashcode값을 전부 비교한다... 전부 같을 경우 set값을 추가해도 그냥 늘어날 뿐이다.
		//equals tostring 값을 설정하고 hashcode 전부설정해서 맞춰야 같은 값은 추가가 안된다.
		//[Bus, Car2, Point(2,3), Point(2,3), Car, Truck, Woman, Child]  point클래스에서 hashcode를 추가하지 않으면 이렇게 뜬다.
		//[Bus, Car2, Point(2,3), Car, Truck, Woman, Child]	point클래스에서 hashcode를 추가하면 이렇게 뜬다.
		
		Point p2 = new Point(2,3);
		hs.add(p2);
		System.out.println(hs.size());
		System.out.println(hs);
		
		System.out.println(hs);                                                                                  
		           
		
//		Iterator it = hs.iterator();	//Iterator 로 데이터를 가져온다.
//		while(it.hasNext()) {
//			String s = (String)it.next();
//			System.out.println(s);
//		}
		
	}

}
