package interface_package;

public class DriveCar {

	public void doDriveCarBus(Bus bus) {	
		bus.doHandling();
		bus.useAccel();
		bus.useBreak();
	}
	public void doDriveCarTruck(Truck truck) {
		truck.doHandling();
		truck.useAccel();
		truck.useBreak();
	}
	public void doDriveCarSportsCar(SprotsCar sprotscar) {
		sprotscar.doHandling();
		sprotscar.useAccel();
		sprotscar.useBreak();
	}
	
	public void doDriveCar(ICarUseable car) {
	//	car.doHandling();		//���⼭�� ��� ���� �ִ�.... �������̽����� ���� �޼��带 �پ��� �Ⱦ��� ������ �����̴�.
		car.useAccel();
		car.useBreak();
	}
	
	//���������� �����ְ� �������� ��� ��ü�� �־ �׿� ���õ� �۵��� ����� �������̴�.
//	public void doDriveCar(��� �ڵ�����ü) {
//		��ü.doHandling();
//		��ü.useAccel();
//		��ü.useBreak();
//	}

}
