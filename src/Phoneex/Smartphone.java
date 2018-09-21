package Phoneex;

public abstract class Smartphone extends Phone {
	@Override
	public void call(String number) {
		// TODO Auto-generated method stub

	}
	public void turnOn() {
		System.out.println("Turn On");
	}
	public void turnOff() {
		System.out.println("Turn Off");
	}
	public void searchInternet(String url){
		System.out.println("searchInternet");
	}

}
