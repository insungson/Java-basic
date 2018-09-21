package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eggMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String morningEgg;
		String lunchEgg;
		String dinnerEgg;

		BufferedReader br = null;
		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);

			System.out.print("아침에 먹은 계란 갯수 : ");
			morningEgg = br.readLine();
			System.out.println("아침에 계란" + morningEgg + "개");
			System.out.println();
			System.out.print("점심에 먹은 계란 갯수 : ");
			lunchEgg = br.readLine();
			System.out.println("점심에 계란" + lunchEgg + "개");
			System.out.println();
			System.out.print("저녁에 먹은 계란 갯수 : ");
			dinnerEgg = br.readLine();
			System.out.println("저녁에 계란" + dinnerEgg + "개");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
