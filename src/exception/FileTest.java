package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream( "d:\\hello.txt" );
			fis.read();	
		} catch( FileNotFoundException ex ) {
			System.out.println( "������ ã�� �� �����ϴ�." );
		} catch( IOException ex ) {
			System.out.println( "���� �� ����" );
		}
	}

}