package day07;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fas = null; // 블록밖에서 선언하여 전체다 쓸수 있도록 한다.
		try {
			fis = new FileInputStream("C:\\Users\\son\\Pictures\\ff.png");
			fas = new FileOutputStream("C:\\Users\\son\\Pictures\\aa.png");

			int data = -1;
			while ((data = fis.read()) != -1) { // 읽어올 값이 없으면 -1을 주는것이 약속된 것이다. 아니면 true false이다.
				fas.write(data);
			}
			System.out.println("work complete!!");
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			try {					//close()에서 에러가 발생하여 try구문을 두번사용하였다.
				if (fis != null)
					fas.close(); // 반환처리할때는 항상 null인지 여부를 체크하고 null이 아닐 경우에만 체크를 해준다.
				if (fas != null)
					fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			} finally {

			}

		}
	}

}
