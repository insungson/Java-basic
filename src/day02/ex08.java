package day02;//07이랑 이어짐

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex07 goods = new ex07();
		goods.name = "nikon";
		goods.price = 10000;
		goods.countstock = 30;
		goods.countsold = 50;
	
		
		//goods.showinfo();

		System.out.println("goodsofcount :"+goods.countofgoods);	//객체를 하나 생성
		
		ex07 goods1 = new ex07();
		
		System.out.println("goodsofcount :"+goods1.countofgoods);	//객체를 두번째 생성하여 출력은 둘다 1이 찍힌다. 07에서 countofgoods앞에 static을 붙이면
																	//이것의 출력값은 2가 나온다.. 
		ex07 goods2 = new ex07();
		System.out.println("goodsofcount :"+ex07.countofgoods);		//위의 방법으로 접근은 할 수 있지만... 이렇게 하면 인스턴스 변수처럼 보이기 때문에 위의 방법은 사용하지않는다.
																	//클래스이름.변수 로 클래스변수를 접근한다...
		
//		System.out.println("name :" + goods.name);
//		System.out.println("price :" + goods.price);
//		System.out.println("countstock :" + goods.countstock);
//		System.out.println("countsold :" + goods.countsold);
	}

}
