package day08MultiThread;

import java.util.List;

public class AlpabaetThread extends Thread {
	private List list;

	public AlpabaetThread(List list) {
		this.list = list;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char ch = 'a'; ch <= 'z'; ch++) {
			synchronized(list) {		//����ȭ �����ִ� �ڵ��̴�.
			System.out.print(ch);
		}
		}
	}

}
