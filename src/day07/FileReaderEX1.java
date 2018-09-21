package day07;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileInputStream fis = null;

		try {
			fr = new FileReader("C:\\Users\\son\\Pictures\\hello.txt");	//char단위(2byte)로 읽기 때문에 char로 변환해도 한글이 깨지지 않는다. 
																		//2byte로 읽기 때문에 읽는 횟수도 적어진다.
			fis = new FileInputStream("C:\\Users\\son\\Pictures\\hello.txt");	//바이트단위로 읽어서 영어는 표현이 되지만 한글은 찌그러져 나온다.
																				//바이트 단위로 읽기 때문에 읽는 횟수도 많아진다.
			int count = 0;
			int data = -1;
			while ((data = fr.read()) != -1) {
				count++;
				System.out.print((char) data);
			}
			System.out.println("\n 읽은 횟수 :" + count);
			System.out.println("*******************************");

			count = 0;
			data = -1;
			while ((data = fis.read()) != -1) {
				count++;
				System.out.print((char) data);
			}
			System.out.println("\n 읽은 횟수 :" + count);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close(); // 자원반납은 중요하기 때문에 finally에 넣는다.
				if (fis != null)
					fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
