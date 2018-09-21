package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardReaderTest {

	public static void main(String[] args) { // 콘솔에 입력한 내용이 버퍼드리더를 통해 프로그램과 연결되어 결과창으로 뜬다.
		// TODO Auto-generated method stub
		BufferedReader br = null;
		InputStreamReader isr = null;

		try {
//	BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));  이렇게 쳐도 되는데  가독성이 떨어지고 try에서 끝에 close()를 할수없다.
			
			isr = new InputStreamReader(System.in, "UTF-8");// UTF-8이 아닌 "EUC-KR"로 읽어야 한글이 읽힌다.
															// 굳이 utf-8로 바꾸고 싶으면 alt
															// - enter를 누르고 언어를 utf-8로 설정하면 한글로 된다.
			// isr = new InputStreamReader(System.in, "EUC-KR"); //여기서 입력값을 받고
			br = new BufferedReader(isr);

			while (true) {
				System.out.print(">>");

				String line = br.readLine(); // 한줄을 읽는다.
				if (line == null)
					break; // 그냥 null값이면 끝난다.
				if ("exit".equals(line) == true) {
					System.out.println("종료합니다.");
					break;
				}

				System.out.println(line); // 이건 읽은 값을 찍어주는 역할을 한다.
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (isr != null)
					isr.close();
				if (br != null)
					br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
