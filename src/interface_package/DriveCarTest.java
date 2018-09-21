package interface_package;

public class DriveCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriveCar dc = new DriveCar();

		Truck truck = new Truck();
		SprotsCar s = new SprotsCar();
		Bus bus = new Bus();
		ICarUseable itruck = new Truck();	//��մ°� �������̽��� ������Ÿ������ ������ �ִٴ� ���̴�.
		ICarUseable ibus = (ICarUseable) bus; // �̰� ���� bus��ü�� �� ICarUseable�̶� �������̽� ���·� ����ȯ �Ѱ��̴�.
		// dc.doDriveCarTruck(truck);
		// dc.doDriveCarSportsCar(s);

		dc.doDriveCar((ICarUseable) truck); // ()�� ��������� ����ȯ�� �� ���̰� (�ڵ带 �����ϱ� �����ϱ����� ���°��̴�.)
		dc.doDriveCar(bus); // ()�� ���� ���� �Ͻ������� ����ȯ�� �� ���̴�. (���� �Ƚᵵ �ȴ�.)
		dc.doDriveCar(s);
		dc.doDriveCar(itruck);
		dc.doDriveCar(ibus);
	}

}
