package interface_package;

public class SprotsCar extends car implements ICarUseable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("������ī�� useaccel �Լ��Դϴ�.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("������ī�� usebreak �Լ��Դϴ�.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("������ī�� usehandling �Լ��Դϴ�.");
	}

}
