package Phoneex;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone sp = new Smartphone() {
		};
		Telephone tp = new Telephone();

		sp.turnOn();
		sp.searchInternet("son");
		sp.turnOff();

		tp.call("010-9298-2134");
		tp.power(true);

	}

}
