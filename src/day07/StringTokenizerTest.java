package day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		FileReader fr = null;
		StringTokenizer st = null;
		try {
			fr = new FileReader("C:\\Users\\son\\Pictures\\phone.txt");
			br = new BufferedReader(fr);
			
			String phoneList;

			while ((phoneList = br.readLine()) != null) {
				 st = new StringTokenizer(phoneList, "- .\t");	//한 라인씩 읽으면서( - . \t 공백)단위로 잘라낸다.	이게 tokenizer의 기능이다.
				 while(st.hasMoreTokens()) {
					 System.out.println(st.nextToken()); 
				 } 
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}