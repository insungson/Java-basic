package homework_day4;

public class MyBase extends Base {				//////�𸣰���.....5������
	
	public void day() {
		System.out.println("������ ������ ������!");
	}
	public void night() {
		System.out.println("night");
	}
	public void afternoon() {
		System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�.");
	}
	
	public void service(String state){
		   if(state.equals("��")) {
			day();
		   } else if(state.equals("��")) {
		      night();	
	           }else {
	        	   afternoon();
	           }
		}
	
	
}
