package day08Threadex;

public class MultiThread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Thread thread = new DigitalThread();
		thread.start();
		
	//	thread.sleep(1000); //1000 = 1�� �̰� 1�� ����ٰ� ����ȴ�.
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
		
	}

}
