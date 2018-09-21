package day07Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader("./src/day07Practice/BufferedReadEX1.java");
		br = new BufferedReader(fr);
		
		int index = 0;
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(++index+" : "+line);
		}
					
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
