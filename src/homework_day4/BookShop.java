package homework_day4;

public class BookShop{
	Book[] books = new Book[10];
	
	public void displayBookInfo(Book[] books) {
		for(int i = 0 ; i<books.length;i++) {
			Book book = books[i];
			book.print(); //book�� print����� �̿��� ���̴�.
		}
	}
	public void rentBook(int bookNo) {
		for(Book book : books) {
			if(book.getBookNo() == bookNo) {
				book.rent();
				break;
			}
		}
	}
}
