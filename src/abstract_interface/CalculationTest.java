package abstract_interface;

public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Plus plus = new Plus() ;
			plus.setData(27,  32);
//			plus.makeResult();
//			plus.answer();
	

			Calculation c = plus ;
			IMakerable im = plus ;
	//		plus.answer();
			
			im.makeResult();
			c.answer();		
	}
}