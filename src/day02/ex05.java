package day02; //p76 �����ε� �ٽ� ���� Ÿ���� ġŰ

public class ex05 {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
		int[]a = {10,20,30};		// debug�� �غ��� a��b�� id ���� �ٸ��ٴ� ���� �� �� �ִ�.
		int[]b = {10,20,30};
		int[]c= null;
		
		boolean result =equals(a,b);
		
		System.out.println("equals(a,b) :" + result);
		System.out.println("a.equals(b) :" + (a.equals(b)));	
		System.out.println("a == b : "+(a==b));
		
		c=a;
		a[0] = 100;
		System.out.println("c[0] :"+c[0]);
		}
		
public static boolean equals(int[] a, int[] b) {
	
	if(a==null) {
		return false;
	}
	if(b ==null) {
		return false;
	}
	if(a.length != b.length) {
		return false;
	}
	int length =a.length;

		for(int i=0; i<a.length;i++) {
			if(a[i] != b[i]) {
				return false;
			}
	}
		return true;
}

}
