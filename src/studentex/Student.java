package studentex;

public class Student extends Person {
	
	private String grade ;
	private String major ;
	
    public Student() {
    	System.out.println("Student Ŭ���� ������ ȣ��");
    }
	public Student(String name) {
		super(name);
	}
	

	public void setGrade(String grade) {
		this.grade = grade ;
	}

    public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getGrade() {
		return grade;
	}


	public void set() {
        age = 30;
        name =  "ȫ�浿";
        height = 175;
        weight = 68;	
     }
    
    public void showStudent() {
    	System.out.println(" age : "+age +", name :" +name + " , heignt :"+ height +", weight :" + weight);
    }


    
    public static void main(String args[]) {
    	Student student1 = new Student() ;
    	student1.set();
    	student1.showStudent();
    	
    	
    }
    
    

    
	
}