import java.util.*;
public class Main
{
void square(int side)
{
   System.out.println(side*side);
}
void rectangle(int length ,int breadth)
{
   System.out.println(length*breadth);
}
void circle(int radius)
{
   System.out.println(3.14*(radius*radius));
}

	public static void main(String[] args) {
		Main ob = new Main();
	   ob.square(4);
	   ob.rectangle(5,5);
	   ob.circle(10);
	}
}