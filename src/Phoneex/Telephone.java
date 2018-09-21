package Phoneex;

public class Telephone extends Phone {
	@Override
	public void call(String number) {
		// TODO Auto-generated method stub
		System.out.println("전화를 "+number+"에 걸었습니다");
	}
	public void power(boolean on) {
		System.out.println("파워를 켰습니다!!");
	}
	
	

}
