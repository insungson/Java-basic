package interface_package;

public class Truck extends car implements ICarUseable {

	@Override
	public void useAccel() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� useaccel �Լ��Դϴ�.");
	}

	@Override
	public void useBreak() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� useBreak �Լ��Դϴ�.");
	}

	@Override
	public void doHandling() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� doHandling �Լ��Դϴ�.");
	}

}
