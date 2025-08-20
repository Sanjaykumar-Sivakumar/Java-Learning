import java.util.*;
//Method OverLoading
public class Main
{
void sub(int a ,int b)
{
   System.out.println(a - b);
}
void add(int a ,int b,int c)
{
   System.out.println(a + b +c);
}
float add(float a ,float b,float c)
{
   return a+b+c;
}
	public static void main(String[] args) {
		Main ob = new Main();
	   ob.sub(3,2);
	   ob.add(5,6,7);
	   System.out.println(ob.add(3.5f,6.7f,7.7f));
	}
}