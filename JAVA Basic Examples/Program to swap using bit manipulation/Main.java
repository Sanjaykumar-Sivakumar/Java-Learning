import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		int a = sc.nextInt();
		System.out.print("Enter the Number2: ");
		int b = sc.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		 System.out.println("Binary value of "+a+" is "+Integer.toBinaryString(a));
         System.out.println("Binary value of "+b+" is "+Integer.toBinaryString(b));
        System.out.print("After Swapping: ");
		System.out.print(a);
		System.out.print(" "+b);
	}
}
		
		