package day02;//08�̶� �̾���		Source -> Generate Getters and Setters (���⼭�� private�� ������ ������ ��ȸ�� �ٲ� �� �ִ�.) �޼ҵ带 �ڵ��������ش�...

public class ex07 {
	
	private	String name ="";
	private	int price;
	private	int countstock;
	private	int countsold;
		static int countofgoods=0; //�տ� static�� �ٿ��� Ŭ���� ����ȭ ������ �Ѵ�.. �̰� �޸𸮿� �Ͻ� ������ �Ǳ� ������.. �̷��� ���� �� ��𼭵� �������� ����� �� �ִ�.
									//ex07.Ŭ���������̸�
		public ex07() {									//�����ڴ� Ŭ���� �̸��� ����. �ٸ������� �̰� ��ü�� �ν��Ͻ�ȭ�ϸ� Ŭ������ �̸��� ���� ������ �ڵ����� �̰� ����ȴ�.
			System.out.println("������ goods()�Դϴ�.");
			countofgoods ++;
		}
		public ex07(String name, int price, int countstock, int countsold) {
										super();
										this.name = name;
										this.price = price;
										this.countstock = countstock;
										this.countsold = countsold;
									}
		//////////////////////////////////////////////////	�̰� ���� ��������... void�� ������ return�� ����Ѵ�.
		public void setname(String name) {
			this.name = name;
		}
		public String getname() {
			return this.name;
		}
		//////////////////////////////////////////////////
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getCountstock() {
			return countstock;
		}
		public void setCountstock(int countstock) {
			this.countstock = countstock;
		}
		public int getCountsold() {
			return countsold;
		}
		public void setCountsold(int countsold) {
			this.countsold = countsold;
		}
	///////////////////////////////////////////////////////////	
public void showinfo() {
	System.out.println("name :"+name);
	System.out.println("price :"+price);
	System.out.println("countstock :"+countstock);
	System.out.println("countsold :"+countsold);
}

}