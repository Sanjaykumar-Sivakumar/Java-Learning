import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num =  sc.nextInt();
		int result= num & (num - 1);
		System.out.println("Bit result: " + Integer.toBinaryString(result));
		System.out.println("Result: "+ result);
	}
}
