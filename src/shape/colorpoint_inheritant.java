package shape;

public class colorpoint_inheritant extends colorpoint {

	String color;
	
	public colorpoint_inheritant(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colorpoint_inheritant c1 = new colorpoint_inheritant(10,20,"yellow");
				c1.show();
		colorpoint_inheritant c2 = (colorpoint_inheritant) new colorpoint(10,20);
	}

}
