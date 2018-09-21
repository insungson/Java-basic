package day07;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEX1 {	//데이터를 읽을때 1개씩 데이터로 읽는다.

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		int data = -1;

		while ((data = input.read()) != -1) {	//데이터가 없으면 -1이 뜨기 때문에 나온다.	// read는 값을 한개씩 읽어 온다.
			System.out.println("data : "+data);	//읽는 값으로 data를 줘서 1개씩 읽어온다.
			output.write(data);
		}
		outSrc = output.toByteArray();

		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));

		
		output.close(); 	//위에서 throws Exception를 안붙이면 exception이 뜨게 된다.
	}

}
