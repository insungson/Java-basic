package day07;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEX2 {	//ex1�� ���ϰ� ���ϱ�  arr(2����Ʈ¥��)�� �迭�� �о� �´�.

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		byte[] arr = new byte[2];	// �迭�� 2�� �༭ ���۸� �ش�.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		int data = -1;
		
		while(true) {
			//���۸�ŭ �����Ϳ���, ���� �����Ͱ� ������  -1�� ������..
			int count = input.read(arr);//�д� ������ arr�迭�� �༭ �� ���� �����͸� �а� �Ѵ�.
			if(count == -1) {
				break;
			}
			System.out.println("data : "+Arrays.toString(arr));
			//ByteArrayoutputStream�� �о�� �����͸� ���� ����.
			output.write(arr);
		}

//		while ((data = input.read()) != -1) {	//�����Ͱ� ������ -1�� �߱� ������ ���´�.	// read�� ���� �Ѱ��� �о� �´�.
//			output.write(data);
//		}
		outSrc = output.toByteArray();

		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));

		
		output.close(); 	//������ throws Exception�� �Ⱥ��̸� exception�� �߰� �ȴ�.
	}

}
