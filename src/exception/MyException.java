package exception;

public class MyException extends Exception {

	public MyException() {
		super("MyException") ;
		
	}
	
	public MyException(String msg) {
		super(msg) ;
	}
	
}