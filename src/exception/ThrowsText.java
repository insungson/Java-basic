package exception;

import java.io.IOException;

public class ThrowsText {


	   public void suspiciousMethod() throws  MyException {

		      System.out.println( "���� �߻� ��" );
			
//		      throw  new  IOException("IO ���� �߻���");      //������ ���� �߻�
		      throw new MyException("MyException11 �߻�~~~") ;				//������ ����� MyException�� ������ ���.
		      //System.out.println( "���� �߻� ��" );	
//////////////////////////		   //   throw�� �����ڰ� ���� �Ǵ��Ͽ� ���ܸ� �߻� ��Ų��.
/////////////////////////		  //    ex) throw new Exception();
////////////////////////////	 //   - throws�� �ڽ��� ȣ���ϴ� �޼ҵ忡�� å���� �ѱ�� ��

		   }
}