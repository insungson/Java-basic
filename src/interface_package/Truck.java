package interface_package;

public class Truck extends car implements ICarUseable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("트럭과 useaccel 함수입니다.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("트럭과 useBreak 함수입니다.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("트럭과 doHandling 함수입니다.");
	}

}
