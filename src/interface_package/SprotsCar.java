package interface_package;

public class SprotsCar extends car implements ICarUseable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("스포츠카와 useaccel 함수입니다.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("스포츠카와 usebreak 함수입니다.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("스포츠카와 usehandling 함수입니다.");
	}

}
