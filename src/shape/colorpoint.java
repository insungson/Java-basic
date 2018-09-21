package shape;

public class colorpoint extends point {
	
//	String color;

	public colorpoint(int x, int y) {
		super(x, y);	//ctrl + 마우스 왼쪽 클릭은 그 함수로 이동을 한다.
		// TODO Auto-generated constructor stub
		//this.color = color;
	}

	public void show() {
		System.out.println("정[x =" + x + ",y = " + y + " color =" + color + "을 그렸습니다.");
	}

	public static void main(String[] args) {
	
		colorpoint a = new colorpoint(10, 20);
		a.show();

	}
}