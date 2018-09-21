package abstract_interface;

public class CalculationTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Calculation c = new Plus() ;
			

			//객체가 Plus 클르스의 인스턴스 인가 ?  true
			System.out.println(c instanceof Plus) ; 
			//instanceof : you check if an object is an instance of a specific class.
			
			//객체가 IMakerable 인터페이스를 구현하였는가 ? true
			System.out.println(c instanceof IMakerable) ;
			
			
			//객체가 Multi 클래스의 인스턴스 인가?  false
			System.out.println(c instanceof Multi) ;	
			
			//객체가 Calculation  클래스의 인스턴스 인가?  true
			System.out.println(c instanceof Calculation) ;	
			
			
	}
}