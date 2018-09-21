package abstract_interface;

public class Miners extends Calculation {

	public void makeResult() {
		result = a - b ;
	}
	
	public void answer() {
		System.out.println( a + " - " + b +" = " + result) ;
	}


}