package abstract_interface;

public class Multi extends Calculation {

	
	//public void makeResult() {		//추상매서드가 아니기 때문에 매서드를 정의하지 않아도 에러는 안난다.
	//	result = a * b ;
//	}
	
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println( a + " * " + b +" = " + result) ;
	}

}