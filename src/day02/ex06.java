package day02;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = new Integer(args[0]).intValue();
		//int count = Integer.parseInt(args[0]);
		for(int i=0;i <=count ;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
