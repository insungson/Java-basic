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
		
		synchronized (counter) {	//synchronized를 쓰면 1~9까지의 합을 아무거나 막 더해주는게 아니라 A면 A가 1~9까지 다 더해지고 이후 B가 다 더해진다.
									//B가 먼저나오고 A가 나올수도 있다. 
		
		
		for(int i =0;i<10;i++ ) {
			counter.add(i);
			System.out.println("["+this.name+"] count : "+counter.count);
		}
		}//synchronized
	}
	

	
}
