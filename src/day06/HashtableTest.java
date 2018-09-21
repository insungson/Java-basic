package day06;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Vector> ht = new Hashtable<String, Vector>();	//generic으로 데이터타입을 설정하면 나중에 출력시 형변환을 할 필요가 없다.
		Vector v1 = new Vector(); 
		Vector v2 = new Vector();
		v1.add("Taxi"); v1.add("Bus"); v1.add("Truck"); 
		v2.add("Man"); v2.add("Woman"); v2.add("Child");
		ht.put("Car",v1);
		ht.put("Person",v2); 
	//	ht.put("name", "홍길동");	//위에서 generic으로 형태를 vector로 정했기 때문에 String형을 넣으면 에러가 발생한다.
		
		System.out.println(ht.get("Car"));
		if( ht.containsKey("Person") ) { 			//이건 key가 있는지 없는지 확인하는 매서드
			System.out.println(ht.get("Person")); 
		}else {
			System.out.println("There isn't KEY you're looking for");
		}

		System.out.println(ht.contains(v1));		//이건 value가 있는지 없는지 확인하는 매서드
		//키 값을 통한 헤쉬테이블의 데이터값 모두 가져오기
		
		Enumeration ekey = ht.keys();
		while(ekey.hasMoreElements()) {
			String key = (String)ekey.nextElement();
			System.out.println(key+":"+ht.get(key));
		}
		
	}

}
