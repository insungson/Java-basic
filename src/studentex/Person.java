package studentex;

public class Person {
    int age;
    public String name;
    protected int height;
    //private int weight;
    public int weight ;
    /**
	public int age ;
    public String name;
    public int height;
    public int weight;
	*/
    
    public Person() {
    	System.out.println("Person 클래스 생성자 호출");
    }
    
    public Person(String name) {
    //	this();
    	this.name = name ;
    }
///////////////////////////////////////////
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public void setGrade(String grade) {}
    
}