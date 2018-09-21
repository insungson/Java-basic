package interface_practice;

public class pricecal extends priceint implements calculater_inter {

	int c;

	@Override
	public void setinterger(int a, int b, int c) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public int Sum() {
		// TODO Auto-generated method stub
		return this.a + this.b + this.c;
	}

	@Override
	public int Multiple() {
		return this.a * this.b * this.c;
		// TODO Auto-generated method stub
	}

	@Override
	public int Minus(int a, int b) {
		return a - b;
		// TODO Auto-generated method stub

	}

	@Override
	public int Minus(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a - b - c;
	}

}
