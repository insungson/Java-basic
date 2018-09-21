package abstract_interface;

public class Plus extends Calculation implements IMakerable{
	
	
	// 인터페이스 makeResult() 구현
	public void makeResult() {
		result = a + b ;
	}
	// 추상클래스의 answer 구현
	public void answer() {
		System.out.println( a + " + " + b +" = " + result) ;
	}
}