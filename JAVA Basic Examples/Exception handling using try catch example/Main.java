import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		try 
		{
		   result = a/b;
		} 
		//we can use [ catch (ArithmeticException e) ] ,it checks only ArithmeticException...
		catch(Exception e) 
		{
		   System.out.println("Thappu da Olunga Podu!!");
		   System.out.println(e);
		}
		
		finally
		{
		   System.out.println("Seri Seri po po");
		}
		System.out.println(result);
	}
}