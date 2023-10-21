package e2e;

public class Student {
	
	String name;
	int Id;
	int Age;
	
	
	public static void main(String[] args) {
		Student javed = new Student();
		javed.setName("Javed");
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
