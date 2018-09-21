package day06;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(); 			//vector에 <Integer>로 제네릭 선언을 하면 아래에서
		System.out.println("Size="+v.size()+" Capacity="+v.capacity());
		for( int i=0; i<=10; i++ ) {
			v.addElement(new Integer(i)); //중요!
			} 
		System.out.println("Size="+v.size()+" Capacity="+v.capacity());
	//	v.add("abcd");	//끝에 추가를 한것이다. 
		
		Integer i0 = (Integer)v.elementAt(0); //중요! 		//여기서 굳이 형변환을 할 필요가 없다.
		int i1 = ((Integer) v.elementAt(10)).intValue();
		System.out.println(i1);
		v.removeElement(i0); //위에서 0번 배열을 의미한다.
		v.removeElement(1); //그냥 숫자를 입력해도 인덱스를 의미한다.
		System.out.println(v);
	}

}
