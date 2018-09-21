package shape;

public class PointTest extends point {

//	public PointTest(int x, int y) {
//		super(x, y);
//		// TODO Auto-generated constructor stub
//	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point p1 = new point();
		p1.setX(2);
		p1.setY(5);
		p1.show();
		
		p1.setX(10);
		p1.setY(23);
		p1.show();
		p1.show(false);
		
		point a = new point(2,3);
		point b = new point(3,4,"red");
		
		a.show(true);
		b.show();
	}

}
