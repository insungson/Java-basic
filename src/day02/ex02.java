package day02;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j=1;
		while (j <= 9) {
			while (i <= 9) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				i ++;
			}
			i=1;
			j++;
			System.out.println("");
		}	
		
//for(int i=0;i<10;i++) {
//	for(int j = 0;j<i;j++) {
//		int multi=i*j;
//	}
//}
	}

}

