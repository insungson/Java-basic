package day07;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fas = null; // ��Ϲۿ��� �����Ͽ� ��ü�� ���� �ֵ��� �Ѵ�.
		try {
			fis = new FileInputStream("C:\\Users\\son\\Pictures\\ff.png");
			fas = new FileOutputStream("C:\\Users\\son\\Pictures\\aa.png");

			int data = -1;
			while ((data = fis.read()) != -1) { // �о�� ���� ������ -1�� �ִ°��� ��ӵ� ���̴�. �ƴϸ� true false�̴�.
				fas.write(data);
			}
			System.out.println("work complete!!");
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			try {					//close()���� ������ �߻��Ͽ� try������ �ι�����Ͽ���.
				if (fis != null)
					fas.close(); // ��ȯó���Ҷ��� �׻� null���� ���θ� üũ�ϰ� null�� �ƴ� ��쿡�� üũ�� ���ش�.
				if (fas != null)
					fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			} finally {

			}

		}
	}

}
