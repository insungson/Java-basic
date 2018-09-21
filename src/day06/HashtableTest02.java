package day06;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hashtable<String, Integer>
		 * 
		 * "둘리" : 10 "고길동" : 20 "길동이" : 30 "또치" : 40 "마이콜" : 50
		 * 
		 * 해당데이터를 해쉬테이블에 입력 후 데이터에 대한 평균을 구하는 프로그램을 작성하시오.
		 */
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("둘리", 10);
		ht.put("고길동", 20);
		ht.put("길동이", 30);
		ht.put("또치", 40);
		ht.put("마이콜", 50);

		System.out.println(ht.get("둘리"));
		Enumeration ekey = ht.keys();
		int calaverage=0;
		while (ekey.hasMoreElements()) {
			String key = (String)ekey.nextElement();
			calaverage += ht.get(key);
			System.out.println(key + ":" + ht.get(key));
		}
		System.out.println("각캐릭터들의 평균값은 : "+(calaverage/ht.size()));
		
		Enumeration<Integer> en = ht.elements();
		int sum = 0;
		int count = ht.size();
		
		while(en.hasMoreElements()) {
			int value = en.nextElement();
			System.out.println("value : " + value);
			sum += value;
		}
		System.out.println("평균 : "+ sum/count);
		
	}
}
