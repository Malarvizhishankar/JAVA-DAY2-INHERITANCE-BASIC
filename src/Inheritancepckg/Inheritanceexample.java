package Inheritancepckg;
import java.io.IOException;
import java.util.Scanner;
public class Inheritanceexample {

	public static void main(String[] args)  throws IOException {
		 String firstname;
		 String lastname;
		 int age;
		 String email;
		 String mobile;
		 int roll;
		 float cgpa;
		 String dept;
		 String year;
		 Scanner s=new Scanner(System.in);
		 firstname=s.nextLine();
		 lastname=s.nextLine();
		 age=s.nextInt();
		 email=s.next();
		 mobile=s.next();
		 roll=s.nextInt();
		 cgpa=s.nextFloat();
		 dept=s.next();
		 year=s.next();
		 Student stu=new Student(firstname,lastname,age,email,mobile,roll,cgpa,dept,year);
		 stu.display();
	}

}
