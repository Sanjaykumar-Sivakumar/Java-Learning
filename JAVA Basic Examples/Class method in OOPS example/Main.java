import java.util.*;
class Student
{
	String name;
	String rollno;
	int age;
void studentinfo()
{
System.out.println(name);
System.out.println(rollno); 
System.out.println(age);
}
}

class Main
{
	public static void main(String[] args) {
		Student ob = new Student();
		ob.name = "Sanjay";
		ob.rollno = "22EC089";
		ob.age = 23;
		ob.studentinfo();
	}
}