package day08MultiThread;

import java.util.ArrayList;
import java.util.List;

public class MultisycTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List list = new ArrayList();
		
		Thread t1 = new AlpabaetThread(list);
		Thread t2 = new DigitalThread(list);
		Thread t3 = new DigitalThread(list);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
