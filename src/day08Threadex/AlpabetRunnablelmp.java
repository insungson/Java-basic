package day08Threadex;

public class AlpabetRunnablelmp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}

	
}
