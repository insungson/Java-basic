package exception;
import java.io.*;		// 검색하면서 ctrl + space는 자동완성으로 찾는 방법임...


public class Echo {

	public static void main(String[] args)throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(input);
		String keyboardinput = reader.readLine();
		
		System.out.print(keyboardinput);
		System.out.println(" has enterd.");
	}

}
