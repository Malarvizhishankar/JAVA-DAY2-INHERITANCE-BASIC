package Inheritancepckg;
//parent class
public class Userclass {

	
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private String mobile;
	
			public Userclass(String firstname, String lastname, int age, String email, String mobile) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.email = email;
			this.mobile = mobile;
		}
		public void display()
	{
		System.out.println("firstname:"+this.firstname);
		System.out.println("lastname:"+this.lastname);
		System.out.println("age:"+this.age);
		System.out.println("email:"+this.email);
		System.out.println("mobile:"+this.mobile);
		
	}
}
