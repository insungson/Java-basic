package day06;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.addElement("물리");
		v.addElement("마이클");
		v.addElement("도우넛");

		int count = v.size();

		for (int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
					//값을 가져올때 클래스마다 지원되는것이 있고 안되는것들이 있다... vector의 경우 Enumeration,Iterator 둘다 지원되는 것이다.
					
		System.out.println("********************************");
		Enumeration<String> e = v.elements();		//vector 값을 elements에 다 집어넣고 이걸 Enumeration<String>을 통해 값을 가져온다.
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		System.out.println("******************************");
		Iterator<String> it = v.iterator();			//vector 값을 iterator에 다 집어넣고 이걸 Iterator<String>을 통해 값을 가져온다.
		while (it.hasNext()) {
			String s = it.next();	//generic을 하지 않을 때는 object형태로 들어가기 때문에 ()로 강제형변환을 해서 값을 넣어야한다.
			System.out.println(s);
		}

	}

}
