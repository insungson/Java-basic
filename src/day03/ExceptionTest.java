package day03;

import java.io.IOException;

import com.sun.rmi.rmid.ExecPermission;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int a = 0;
		double b = 100 / a;
		
		try {
			double b = 100 / a;
			System.out.println("Some more codes in try block");
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

		System.out.println("Some more codes");
	}

}
