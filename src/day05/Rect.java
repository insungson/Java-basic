package day05; //11p ¹®Á¦

public class Rect {
	private int width;
	private int height;

	public Rect(int width, int height) {
		// super();
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Rect rec = (Rect) obj;
		if ((this.width * this.height) == (rec.height * rec.width)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rect("+width+","+height+")";
	}
	
	
	
}