package day07Practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEX1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = -1;
		
		while ((data = input.read()) != -1) {
			System.out.println("data : "+ data);
			output.write(data);
		}
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
		output.close();
	}

}
