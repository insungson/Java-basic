package day08Threadex;

public class MultiThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1 = new DigitalThread();			//���� thread�� ������ �ƴ� �������̷� ���´�... ���� �ȵ�...
		Thread thread2 = new DigitalThread();
		Thread thread3 = new AlpabetThread();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
