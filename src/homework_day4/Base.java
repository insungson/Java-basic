package homework_day4;

public class Base {
	public void service(String state){
	   if(state.equals("³·")) {
	      day();
	   } else {
	      night();	
           }
	}
	
	public void day() {
		System.out.println("³·");
	}
	
	public void night() {
		System.out.println("night");
	}
}

