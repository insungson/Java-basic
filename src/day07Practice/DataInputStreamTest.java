package day07Practice;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\son\\Pictures\\hello.txt";

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			String name = dis.readUTF();
			int salary = dis.readInt();
			boolean isMale = dis.readBoolean();

			System.out.println("이름 : " + name);
			System.out.println("월급 : " + salary);
			System.out.println("성별 : " + isMale);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}

	}

}
