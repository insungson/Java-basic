package day06;

import java.util.Iterator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new java.util.LinkedList<>();

		// »ğÀÔ
		list.add("hong");
		list.add("lii");
		list.add("doll");

		// ¼øÈ¸
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("**********************************");
		list.remove(1);
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
