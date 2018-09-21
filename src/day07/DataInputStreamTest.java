package day07;

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
			fis = new FileInputStream(path); // 3���� �����ߴ�. ������ó�� �����Ѱ��̴�.
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis); // bis -> fis�� �ٷ� �������� �ֻ����� ���� �۵��� �ȴ�.

			// ����
			String name = dis.readUTF(); // utf������ ����..
			int salary = dis.readInt();
			boolean isMale = dis.readBoolean();

			System.out.println("�̸� : " + name);
			System.out.println("���� : " + salary);
			System.out.println("���� : " + isMale);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close(); // ������ �������� �� ������ ������� ������ �ȳ���.
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
