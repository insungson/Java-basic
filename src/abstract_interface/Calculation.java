package abstract_interface;

public abstract class Calculation {
	int a;
	int b;
	int result;
	
	public abstract void answer();
	
	public void setData(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public void makeResult() {	//추상클래스에 있지만 추상매서드는 아니다.
		// TODO Auto-generated method stub
		
	}
}
