package day06;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(); 			//vector�� <Integer>�� ���׸� ������ �ϸ� �Ʒ�����
		System.out.println("Size="+v.size()+" Capacity="+v.capacity());
		for( int i=0; i<=10; i++ ) {
			v.addElement(new Integer(i)); //�߿�!
			} 
		System.out.println("Size="+v.size()+" Capacity="+v.capacity());
	//	v.add("abcd");	//���� �߰��� �Ѱ��̴�. 
		
		Integer i0 = (Integer)v.elementAt(0); //�߿�! 		//���⼭ ���� ����ȯ�� �� �ʿ䰡 ����.
		int i1 = ((Integer) v.elementAt(10)).intValue();
		System.out.println(i1);
		v.removeElement(i0); //������ 0�� �迭�� �ǹ��Ѵ�.
		v.removeElement(1); //�׳� ���ڸ� �Է��ص� �ε����� �ǹ��Ѵ�.
		System.out.println(v);
	}

}
