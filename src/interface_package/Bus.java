package interface_package;

public class Bus extends car implements ICarUseable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("������ useaccel �Լ��Դϴ�.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("������ usebreak �Լ��Դϴ�.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("������ usehandling �Լ��Դϴ�.");
	}

}
