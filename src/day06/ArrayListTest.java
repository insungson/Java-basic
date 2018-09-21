package day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	List<String> list2 = Collection.synchronizedList(new ArrayList<String>()); //동기화 시킬때 앞에 이걸 붙이면 된다.
		
		List<String> list = new ArrayList<String>();
		list.add("hong");
		list.add("song");
		list.add("zong");
		
		int count = list.size();
		for(int i=0;i<count;i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		System.out.println("*****************");
		list.remove("song");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
