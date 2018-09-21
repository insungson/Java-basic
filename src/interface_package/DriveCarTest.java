package interface_package;

public class DriveCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriveCar dc = new DriveCar();

		Truck truck = new Truck();
		SprotsCar s = new SprotsCar();
		Bus bus = new Bus();
		ICarUseable itruck = new Truck();	//재밌는건 인터페이스를 데이터타입으로 쓸수도 있다는 것이다.
		ICarUseable ibus = (ICarUseable) bus; // 이건 위의 bus객체를 로 ICarUseable이란 인터페이스 형태로 형변환 한것이다.
		// dc.doDriveCarTruck(truck);
		// dc.doDriveCarSportsCar(s);

		dc.doDriveCar((ICarUseable) truck); // ()은 명시적으로 형변환을 한 것이고 (코드를 이해하기 쉽게하기위해 쓰는것이다.)
		dc.doDriveCar(bus); // ()가 없는 것은 암시적으로 형변환을 한 것이다. (굳이 안써도 된다.)
		dc.doDriveCar(s);
		dc.doDriveCar(itruck);
		dc.doDriveCar(ibus);
	}

}
