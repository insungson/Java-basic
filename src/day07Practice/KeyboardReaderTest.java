package day07Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in, "EUC-KR");
			br = new BufferedReader(isr);

			while (true) {
				System.out.print(">>");

				String line = br.readLine();
				if (line == null)
					break;
				if ("exit".equals(line) == true) {
					System.out.println("종료합니다.");
					break;
				}

				System.out.println(line);
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
