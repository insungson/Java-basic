package day07Practice;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\\\Users\\\\son\\\\Pictures\\\\hello.txt";

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);

			dos.writeUTF("ȫ�浿");
			dos.writeInt(100);
			dos.writeBoolean(true);

			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();

			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}
}
