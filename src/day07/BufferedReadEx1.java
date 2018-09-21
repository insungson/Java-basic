package day07;		//p69에 있는 내용이다.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader("./src/day07/BufferedReadEx1.java");
			br = new BufferedReader(fr);

			int index = 0;
			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(++index + " : " + line); // 한줄씩 돌아가면서 찍어주는 함수이다.. 
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
