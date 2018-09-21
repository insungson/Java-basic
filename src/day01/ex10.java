package day01;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 9) {
			int j = 0;
			i += 1;
			while (j <= 9) {
				j += 1;
				System.out.println(i+"*"+j
						+"="+(j*i));
			}
			j=1;
			System.out.print("\n");
		
	}
	}
}


//šïÇà°á°ú
//2*1=2
//2*2=4
//2*3=6
//...
//9*9=81