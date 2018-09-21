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
			fis = new FileInputStream(path); // 3개를 연결했다. 파이프처럼 연결한것이다.
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis); // bis -> fis로 바로 파이프의 최상위를 껴도 작동은 된다.

			// 쓰기
			String name = dis.readUTF(); // utf형으로 썻다..
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
					dis.close(); // 끝내는 순서역시 맨 끝부터 없애줘야 에러가 안난다.
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
