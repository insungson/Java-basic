package interface_package;

public class Bus extends car implements ICarUseable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("버스와 useaccel 함수입니다.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("버스와 usebreak 함수입니다.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("버스와 usehandling 함수입니다.");
	}

}
