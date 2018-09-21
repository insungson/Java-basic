package day07Practice;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		FileInputStream fis = null;
		
		try {
			fr = new FileReader("C:\\Users\\son\\Pictures\\hello.txt");
			fis = new FileInputStream("C:\\Users\\son\\Pictures\\hello.txt");

		int count = 0;
		int data =-1;
		while((data = fr.read()) != -1) {
			count++;
			System.out.print((char) data);
		}
		System.out.println("\n ÀÐÀº È½¼ö : " + count);
		System.out.println("*******************************");
		
		count = 0;
		data = -1;
		while((data = fis.read()) != -1) {
			count++;
			System.out.print((char)data);
		}
		System.out.print("\n ÀÐÀº È½¼ö : " + count);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null)
					fr.close();
				if(fis != null)
					fis.close();
			}catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}

}
