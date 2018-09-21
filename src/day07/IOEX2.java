package day07;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEX2 {	//ex1번 파일과 비교하기  arr(2바이트짜리)로 배열로 읽어 온다.

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		byte[] arr = new byte[2];	// 배열을 2로 줘서 버퍼를 준다.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		int data = -1;
		
		while(true) {
			//버퍼만큼 데이터열기, 열을 데이터가 없으면  -1을 리턴함..
			int count = input.read(arr);//읽는 값으로 arr배열을 줘서 더 빨리 데이터를 읽게 한다.
			if(count == -1) {
				break;
			}
			System.out.println("data : "+Arrays.toString(arr));
			//ByteArrayoutputStream에 읽어온 데이터를 쓰기 수정.
			output.write(arr);
		}

//		while ((data = input.read()) != -1) {	//데이터가 없으면 -1이 뜨기 때문에 나온다.	// read는 값을 한개씩 읽어 온다.
//			output.write(data);
//		}
		outSrc = output.toByteArray();

		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));

		
		output.close(); 	//위에서 throws Exception를 안붙이면 exception이 뜨게 된다.
	}

}
