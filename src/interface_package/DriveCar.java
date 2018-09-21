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
	//	car.doHandling();		//여기서도 골라서 쓸수 있다.... 인터페이스에서 사용된 메서드를 다쓰든 안쓰든 본인의 선택이다.
		car.useAccel();
		car.useBreak();
	}
	
	//최종적으로 보여주고 싶은것은 어떠한 객체를 넣어도 그와 관련된 작도을 만들고 싶은것이다.
//	public void doDriveCar(어떠한 자동차객체) {
//		객체.doHandling();
//		객체.useAccel();
//		객체.useBreak();
//	}

}
