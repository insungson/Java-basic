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

			System.out.print("��ħ�� ���� ��� ���� : ");
			morningEgg = br.readLine();
			System.out.println("��ħ�� ���" + morningEgg + "��");
			System.out.println();
			System.out.print("���ɿ� ���� ��� ���� : ");
			lunchEgg = br.readLine();
			System.out.println("���ɿ� ���" + lunchEgg + "��");
			System.out.println();
			System.out.print("���ῡ ���� ��� ���� : ");
			dinnerEgg = br.readLine();
			System.out.println("���ῡ ���" + dinnerEgg + "��");

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
