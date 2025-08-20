import java.util.*;
class Student
{
	private int id ;
	private String name ;
	private double salary  ;

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setid(int id)
	{
		if(id>0)
		{
			this.id = id;
		}
		else {
			System.out.println("Invalid ID. ID must be positive.");
		}
	}
	public int getid()
	{
		return id;
	}

	public void setsalary(double salary)
	{
		if(salary>=0)
		{
			this.salary = salary;
		}
		else {
			System.out.println("Invalid Salary. Salary must be non-negative.");
		}
	}
	public double getsalary()
	{
		return salary;
	}
	public void display()
	{
		if(id>0 && salary>=0)
		{
			System.out.println("Employee Details:");
			System.out.println("Name: " + name);
			System.out.println("ID: " + id);
			System.out.println("Salary: $" + salary);
		}
		else {
			System.out.println("Employee data is not valid.");
		}
	}
}

class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Student ob = new Student();
		System.out.print("Enter name: ");
		ob.setName(sc.nextLine());

		System.out.print("Enter ID: ");
		ob.setid(sc.nextInt());
		System.out.print("Enter salary: ");
		ob.setsalary(sc.nextDouble());

		System.out.println("\nEmployee Details:");
		System.out.println("Name: " + ob.getName());
		System.out.println("ID: " + ob.getid());
		System.out.println("Salary: $" + ob.getsalary());
	}
}