import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		int num = sc.nextInt();
		System.out.print("Enter k: ");
		int k = sc.nextInt();
		int result= num^(1<<(k - 1));
		if(result !=0)
		{
		    System.out.println("After changing: "+Integer.toBinaryString(result));
		}
	}
}