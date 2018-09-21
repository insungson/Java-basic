package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// (기존에는 이런 방식으로 파일을 쓰는게 가능했지만... )
public class BufferedOutputStreamEX1 { // file(123.txt) -------------FileOutputStream --------program(우리가 사용하는 프로그램)
										// (bufferedoutput의 write 기능을 통해 아래와 같이 연결할 수 있다. )
										// file(123.txt)--------FileOutputStream-------BufferedOutputStream-----program(우리가 사용하는 프로그램)
	public static void main(String[] args) { 									// (write()함수가 있어서 편하게 쓸수있다.)
		// TODO Auto-generated method stub 		//** 중요한것은 BufferedOutputStream을 먼저 close()로
												// 반환하고 FileOutputStream을 close() 해줘야 에러가 안난다.

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
				// if(bos !=null)bos.close(); //순서를 바꾸면 에러가 발생하지 않는다.
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
