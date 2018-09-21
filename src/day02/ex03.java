package day02;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intarray = new int[5];
		intarray[0] = 3;
		intarray[1] = 6;
		intarray[2] = 9;

		int result = 0;
		for (int i = 0; i < intarray.length; i++) {
			// for(int i : intarray) {
			result = result + intarray[i];
		}
		System.out.println("result의 결과값:" + result);
		System.out.println("intarray의 4번쨰 값:" + intarray[3]);
	}

}