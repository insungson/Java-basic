package shape;

public class point {
	private int x = 0;
	private int y = 0;
	private String color;

	public point() {}
	public point(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}
	
	public point(int x, int y, String color) {
		//super();
		this.x = x;
		this.y = y;
		this.color = color;
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		if(color == "") {
			System.out.println("��[x =" + x + ",y = " + y + "]�� �׷Ƚ��ϴ�.");
		}else {
			System.out.println("��[x =" + x + ",y = " + y + ",color ="+color+"]�� �׷Ƚ��ϴ�.");
		}
	}

	

	public void show(boolean del) {
		if (del) {
			System.out.println("��[x =" + x + ",y = " + y + "]�� �������ϴ�.");
		} else {
			System.out.println("��[x =" + x + ",y = " + y + "]�� �׷Ƚ��ϴ�.");
		}
	}
}