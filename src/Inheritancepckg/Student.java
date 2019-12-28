package Inheritancepckg;
//child class extends userclass
//extends keyword for performing inheritance
public class Student extends Userclass {
	private int roll;
	private float cgpa;
	private String dept;
	private String year;
public Student(String firstname, String lastname, int age, String email, String mobile, int roll, float cgpa,
			String dept, String year) {
		super(firstname,lastname,age,email,mobile);
		this.roll=roll;
		this.cgpa=cgpa;
		this.dept=dept;
		this.year=year;
		
	}
	public void display()
	{
		super.display();
		System.out.println("Roll:"+roll);
		System.out.println("Cgpa:"+cgpa);
		System.out.println("Dept:"+dept);
		System.out.println("Year:"+year);
	}
}
