package studentex;

public class UpcastingTest {
	public static void main(String[] args){
	    
		Student su = new Student("�ƹ���") ;
		Person  pu = su ;
		
		
	     //Person pd = new Student("�ȴ���" );
	     //Student sd = (Student)pd;
	     //Up Casting �� ��������θ� ��� ���� .
	    
		
	     System.out.println( pu.getName() );
	     pu.setGrade( "A"  );    
	  
	  } 	

}