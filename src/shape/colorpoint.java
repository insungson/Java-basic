package shape;

public class colorpoint extends point {
	
//	String color;

	public colorpoint(int x, int y) {
		super(x, y);	//ctrl + ���콺 ���� Ŭ���� �� �Լ��� �̵��� �Ѵ�.
		// TODO Auto-generated constructor stub
		//this.color = color;
	}

	public void show() {
		System.out.println("��[x =" + x + ",y = " + y + " color =" + color + "�� �׷Ƚ��ϴ�.");
	}

	public static void main(String[] args) {
	
		colorpoint a = new colorpoint(10, 20);
		a.show();

	}
}