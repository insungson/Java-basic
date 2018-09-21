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
			synchronized (list) {		//list��� �����ڿ��� ���� �ֱ� ������ synchronized�� �ɾ ����ȭ ��Ű�� �ڵ����� �����ڿ� ������ ����.
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
