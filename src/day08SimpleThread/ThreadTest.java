package day08SimpleThread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
																//�̰� �񵿱�ȭ��� �Ѵ�.(�������� �� �۾�)
		Counter counter = new Counter();
		Thread threadA = new CounterThread(counter, "A");		//A,B ��� counter�� ���� ����.
		Thread threadB = new CounterThread(counter, "B");		//A,B ���� ��� 1~9���� count�� ��� �������� ������(����1~9�� ���� 45) count�� ���� 90�� �ȴ�.
																//������ A�� ��� B�� ��������� ������ �� ���� 90�� ���ü� �ۿ� ����.
		
		threadA.start();
		threadB.start();
		
		Thread.sleep(2000);	//�̰� �־� �����̸� �ָ� ó���� 0���� �������� 90���� ���.	 
		
		System.out.println(((CounterThread)threadA).counter.count);
		System.out.println(((CounterThread)threadB).counter.count);
	}

}
