package exception;

public class ExceptionTest {

	public static void main(String args[]) {
		int a = 0;
		
		try {
			int b = 100 / a;
		} catch( ArithmeticException ex ) {
			//ex.printStackTrace();
			//1. ���
			System.out.println( "�˼��մϴ�." );
			
			//2. �α� �����
			System.out.println( "�α�:" + ex );
			
			//3. ����
			return;
		} finally {
			//�ڿ� ����
			System.out.println( "�ڿ�����" );
		}
		
		System.out.println( "Some more Codes" );
		
	}
	
}