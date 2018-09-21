package homework_day4;

public class Depart extends Employee {
	String department;

	public Depart(String name, int salary ,String department) {
		super(name, salary);
		if(department == "개발부") {
			this.department = "기획부";
		}else {
			this.department = department;
		}
			
	}
	
	public void getInformation() {
		System.out.printf("이름: %s   연봉: %d   부서: %s\n", getName(), getSalary(), department);
	}

}
