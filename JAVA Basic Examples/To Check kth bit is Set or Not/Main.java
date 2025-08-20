import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		System.out.print("Enter the position to check: ");
		int k = sc.nextInt();
		int b = num&(1<<(k - 1));
		if(b!=0)
		{
		    System.out.println("The "+k+"th bit is: SET.");
		}
		else{
		System.out.println("The "+k+"th bit is: Not a SET.");
		}
	}
}
