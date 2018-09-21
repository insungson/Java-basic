package day08SimpleThread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
																//이걸 비동기화라고 한다.(순서없이 막 작업)
		Counter counter = new Counter();
		Thread threadA = new CounterThread(counter, "A");		//A,B 모두 counter에 같이 쓴다.
		Thread threadB = new CounterThread(counter, "B");		//A,B 따로 모두 1~9까지 count에 계속 더해지기 때문에(따로1~9의 합은 45) count의 값이 90이 된다.
																//순서가 A가 몇번 B가 몇번인지는 모르지만 총 합이 90이 나올수 밖에 없다.
		
		threadA.start();
		threadB.start();
		
		Thread.sleep(2000);	//이걸 넣어 딜레이를 주면 처음의 0값이 마지막에 90으로 뜬다.	 
		
		System.out.println(((CounterThread)threadA).counter.count);
		System.out.println(((CounterThread)threadB).counter.count);
	}

}
