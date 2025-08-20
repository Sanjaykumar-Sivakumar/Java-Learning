import java.util.*;
interface College{
   void Classroom();
}
class Student implements College
{
   public void Classroom()
   {
      System.out.println("130 Students in ECE");
   }
}
class Teacher implements College
{
   public void Classroom()
   {
      System.out.println("24 Faculties");
   }
}
public class Main
{
	public static void main(String[] args) {
		Student ob = new Student();
		Teacher ob1 = new Teacher();
		ob.Classroom();
		ob1.Classroom();
	}
}