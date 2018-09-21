package day08SimpleThread;

public class CounterThread extends Thread {

	public Counter counter = null;
	public String name = "";

	public CounterThread(Counter counter, String name) {
		//super();
		this.counter = counter;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (counter) {	//synchronized�� ���� 1~9������ ���� �ƹ��ų� �� �����ִ°� �ƴ϶� A�� A�� 1~9���� �� �������� ���� B�� �� ��������.
									//B�� ���������� A�� ���ü��� �ִ�. 
		
		
		for(int i =0;i<10;i++ ) {
			counter.add(i);
			System.out.println("["+this.name+"] count : "+counter.count);
		}
		}//synchronized
	}
	

	
}
