package exception;

import java.io.IOException;

public class ThrowsText {


	   public void suspiciousMethod() throws  MyException {

		      System.out.println( "예외 발생 전" );
			
//		      throw  new  IOException("IO 에러 발생함");      //강제로 예외 발생
		      throw new MyException("MyException11 발생~~~") ;				//내용을 지우면 MyException의 내용이 뜬다.
		      //System.out.println( "예외 발생 후" );	
//////////////////////////		   //   throw는 개발자가 직접 판단하여 예외를 발생 시킨다.
/////////////////////////		  //    ex) throw new Exception();
////////////////////////////	 //   - throws는 자신을 호출하는 메소드에게 책임을 넘기는 것

		   }
}