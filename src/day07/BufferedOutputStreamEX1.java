package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// (�������� �̷� ������� ������ ���°� ����������... )
public class BufferedOutputStreamEX1 { // file(123.txt) -------------FileOutputStream --------program(�츮�� ����ϴ� ���α׷�)
										// (bufferedoutput�� write ����� ���� �Ʒ��� ���� ������ �� �ִ�. )
										// file(123.txt)--------FileOutputStream-------BufferedOutputStream-----program(�츮�� ����ϴ� ���α׷�)
	public static void main(String[] args) { 									// (write()�Լ��� �־ ���ϰ� �����ִ�.)
		// TODO Auto-generated method stub 		//** �߿��Ѱ��� BufferedOutputStream�� ���� close()��
												// ��ȯ�ϰ� FileOutputStream�� close() ����� ������ �ȳ���.

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\son\\Pictures\\hello.txt");
			bos = new BufferedOutputStream(fos, 5);

			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();
				// if(bos !=null)bos.close(); //������ �ٲٸ� ������ �߻����� �ʴ´�.
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
