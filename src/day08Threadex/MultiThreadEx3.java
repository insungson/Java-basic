package day08Threadex;

public class MultiThreadEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1 = new Thread(new AlpabetRunnablelmp());
		Thread thread2 = new Thread(new DigitalRunnablelmpl());
		
		thread1.start();
		thread2.start();		//������� �ٸ��� ���´�... ������ �׻� �ٲ��.
		
	}

}


//����ȭ vs �񵿱�ȭ
//						1 -----> �ڿ� <--------2
//						