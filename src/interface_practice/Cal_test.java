package interface_practice;

public class Cal_test extends pricecal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculater_inter ci = new pricecal();
		ci.setinterger(10, 20, 30);
		ci.Sum();
		ci.Multiple();
		System.out.println("�Է��� ���ڴ� "+((priceint) ci).getA()+","+((priceint) ci).getB()+","+((pricecal) ci).getC()+"�̰� ���� :"+ci.Sum()+"���� :"+ci.Multiple()+"�̴�.");
		
	}

}
