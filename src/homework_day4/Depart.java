package homework_day4;

public class Depart extends Employee {
	String department;

	public Depart(String name, int salary ,String department) {
		super(name, salary);
		if(department == "���ߺ�") {
			this.department = "��ȹ��";
		}else {
			this.department = department;
		}
			
	}
	
	public void getInformation() {
		System.out.printf("�̸�: %s   ����: %d   �μ�: %s\n", getName(), getSalary(), department);
	}

}
