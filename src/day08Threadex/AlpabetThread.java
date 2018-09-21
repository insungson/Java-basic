package day08Threadex;

public class AlpabetThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}



}
