package day07;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\son\\Pictures\\hello.txt";

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream(path); // 3개를 연결했다. 파이프처럼 연결한것이다.
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos); //	bos -> fos로 바로 파이프의 최상위를 껴도 작동은 된다.

			// 쓰기
			dos.writeUTF("홍길동"); // utf형으로 썻다..
			dos.writeInt(100);
			dos.writeBoolean(true);

			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close(); // 끝내는 순서역시 맨 끝부터 없애줘야 에러가 안난다.
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
