package interface_another;

public class SoundTest {

	public static void printSound(Soundable a) {	// ���� Ŭ�������� static�� ����ϸ� �Ʒ��� ���� �ν��Ͻ��� ������ �ʰ� ����� �� �ִ�.. �Ʒ��� car�� ���غ���
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
