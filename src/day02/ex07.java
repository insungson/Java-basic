package day02;//08이랑 이어짐		Source -> Generate Getters and Setters (여기서는 private로 설정한 변수를 우회로 바꿀 수 있다.) 메소드를 자동생성해준다...

public class ex07 {
	
	private	String name ="";
	private	int price;
	private	int countstock;
	private	int countsold;
		static int countofgoods=0; //앞에 static을 붙여서 클래스 변수화 선언을 한다.. 이건 메모리에 일시 저장이 되기 때문에.. 이렇게 쓰면 다 어디서든 같은값을 사용할 수 있다.
									//ex07.클래스변수이름
		public ex07() {									//생성자는 클래스 이름과 같다. 다른곳에서 이걸 객체로 인스턴스화하면 클래스와 이름이 같기 때문에 자동으로 이게 실행된다.
			System.out.println("생성자 goods()입니다.");
			countofgoods ++;
		}
		public ex07(String name, int price, int countstock, int countsold) {
										super();
										this.name = name;
										this.price = price;
										this.countstock = countstock;
										this.countsold = countsold;
									}
		//////////////////////////////////////////////////	이건 같은 것이지만... void가 없으면 return을 써야한다.
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