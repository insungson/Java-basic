package studentex;

public class UpcastingTest {
	public static void main(String[] args){
	    
		Student su = new Student("아무개") ;
		Person  pu = su ;
		
		
	     //Person pd = new Student("안대혁" );
	     //Student sd = (Student)pd;
	     //Up Casting 시 명시적으로만 사용 가능 .
	    
		
	     System.out.println( pu.getName() );
	     pu.setGrade( "A"  );    
	  
	  } 	

}