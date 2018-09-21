package day07Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fas = null;

		try {
			fis = new FileInputStream("C:\\Users\\son\\Pictures\\ff.png");
			fas = new FileOutputStream("C:\\Users\\son\\Pictures\\aa.png");

			int data = -1;
			while ((data = fis.read()) != -1) {
				fas.write(data);
			}
			System.out.println("work complete!!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fas != null)
					fas.close();
				if (fis != null)
					fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
