package day01;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 2;
		while (i <= 9) {
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j += 1;
			}
			i += 1;
			j = 1;
		}
	}

}
