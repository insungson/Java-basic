package abstract_interface;

public class Plus extends Calculation implements IMakerable{
	
	
	// �������̽� makeResult() ����
	public void makeResult() {
		result = a + b ;
	}
	// �߻�Ŭ������ answer ����
	public void answer() {
		System.out.println( a + " + " + b +" = " + result) ;
	}
}