package exception;
import java.io.*;		// �˻��ϸ鼭 ctrl + space�� �ڵ��ϼ����� ã�� �����...


public class Echo {

	public static void main(String[] args)throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(input);
		String keyboardinput = reader.readLine();
		
		System.out.print(keyboardinput);
		System.out.println(" has enterd.");
	}

}
