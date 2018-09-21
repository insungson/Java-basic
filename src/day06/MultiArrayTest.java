package day06;

public class MultiArrayTest {		//2차원 배열에 대한 코드...

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 110, 20, 30, 40 }, { 50, 60 }, { 70 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
			}
		}
	}

}
