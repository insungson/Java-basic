package abstract_interface;

public class CalculationTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Calculation c = new Plus() ;
			

			//��ü�� Plus Ŭ������ �ν��Ͻ� �ΰ� ?  true
			System.out.println(c instanceof Plus) ; 
			//instanceof : you check if an object is an instance of a specific class.
			
			//��ü�� IMakerable �������̽��� �����Ͽ��°� ? true
			System.out.println(c instanceof IMakerable) ;
			
			
			//��ü�� Multi Ŭ������ �ν��Ͻ� �ΰ�?  false
			System.out.println(c instanceof Multi) ;	
			
			//��ü�� Calculation  Ŭ������ �ν��Ͻ� �ΰ�?  true
			System.out.println(c instanceof Calculation) ;	
			
			
	}
}