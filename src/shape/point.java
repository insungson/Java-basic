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
			System.out.println("정[x =" + x + ",y = " + y + "]을 그렸습니다.");
		}else {
			System.out.println("정[x =" + x + ",y = " + y + ",color ="+color+"]을 그렸습니다.");
		}
	}

	

	public void show(boolean del) {
		if (del) {
			System.out.println("정[x =" + x + ",y = " + y + "]을 지웠습니다.");
		} else {
			System.out.println("정[x =" + x + ",y = " + y + "]을 그렸습니다.");
		}
	}
}