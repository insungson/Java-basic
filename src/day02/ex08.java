package day02;//07�̶� �̾���

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex07 goods = new ex07();
		goods.name = "nikon";
		goods.price = 10000;
		goods.countstock = 30;
		goods.countsold = 50;
	
		
		//goods.showinfo();

		System.out.println("goodsofcount :"+goods.countofgoods);	//��ü�� �ϳ� ����
		
		ex07 goods1 = new ex07();
		
		System.out.println("goodsofcount :"+goods1.countofgoods);	//��ü�� �ι�° �����Ͽ� ����� �Ѵ� 1�� ������. 07���� countofgoods�տ� static�� ���̸�
																	//�̰��� ��°��� 2�� ���´�.. 
		ex07 goods2 = new ex07();
		System.out.println("goodsofcount :"+ex07.countofgoods);		//���� ������� ������ �� �� ������... �̷��� �ϸ� �ν��Ͻ� ����ó�� ���̱� ������ ���� ����� ��������ʴ´�.
																	//Ŭ�����̸�.���� �� Ŭ���������� �����Ѵ�...
		
//		System.out.println("name :" + goods.name);
//		System.out.println("price :" + goods.price);
//		System.out.println("countstock :" + goods.countstock);
//		System.out.println("countsold :" + goods.countsold);
	}

}
