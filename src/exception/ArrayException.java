package exception;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] intArray = new int[5];
			intArray[0] = 0;
	
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i]; // i = 4인 경우 예외 발생	실행중 종료가 됨... 
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}