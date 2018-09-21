package interface_another;

public class SoundTest {

	public static void printSound(Soundable a) {	// 같은 클래스에서 static을 사용하면 아래서 따로 인스턴스를 만들지 않고 사용할 수 있다.. 아래의 car와 비교해보자
		System.out.println(a.sound());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparow());
		printSound(new Duck());

	}


}
