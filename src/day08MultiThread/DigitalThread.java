package day08MultiThread;

import java.util.List;

public class DigitalThread extends Thread {
	private List list;

	public DigitalThread(List list) {
		// super();
		this.list = list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
			synchronized (list) {		//list라는 공유자원을 쓰고 있기 때문에 synchronized를 걸어서 동기화 시키면 자동으로 공유자원 변수가 들어간다.
				System.out.print(cnt);
				list.add(cnt);
			}
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
