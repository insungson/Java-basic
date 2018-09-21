package day08Threadex;

public class MultiThreadEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1 = new Thread(new AlpabetRunnablelmp());
		Thread thread2 = new Thread(new DigitalRunnablelmpl());
		
		thread1.start();
		thread2.start();		//결과값이 다르게 나온다... 순서가 항상 바뀐다.
		
	}

}


//동기화 vs 비동기화
//						1 -----> 자원 <--------2
//						