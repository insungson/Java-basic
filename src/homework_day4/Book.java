package homework_day4;

public class Book {

	int bookNo=0;
	String title="";
	String author="";
	int stateCode=0;	//�����Ҷ� 1�� ����
	
	
	
	public Book(int bookNo, String title, String author) {
		//super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = (stateCode = 1);
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void rent () {
		stateCode = 0;
		System.out.println(title + "��(��) �뿩 �ƽ��ϴ�.");
	}
	public void print() {
		System.out.println("å ����:"+title+", �۰�:"+author+", �뿩 ����:"+(stateCode == 1 ? "�������":"������"));	
	}															//stateCode�� 1�̸� ������������� 1�� �ƴϸ� �������� ����...
	
	

	
}
