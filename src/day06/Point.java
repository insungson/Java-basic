package day06;

public class Point {
	private int x = 0;
	private int y = 0;
	public int getX() {
		return x;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(int i, int j) {
		
		this.x = i;
		this.y = j;
		// TODO Auto-generated constructor stub
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return "Point("+x+","+y+")";
	}

	
	

	}
