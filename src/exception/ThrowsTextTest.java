package exception;

import java.io.IOException;

public class ThrowsTextTest {
	public static void main(String[] args) {
		ThrowsText throwsText = new ThrowsText( ) ;
		// 컴파일 오류
		
		try {
			throwsText.suspiciousMethod();
		}catch(MyException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}