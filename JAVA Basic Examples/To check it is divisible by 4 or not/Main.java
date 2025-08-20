import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		if((num & 3)== 0)
		{
		    System.out.println("It is Divisible by 4");
		}
		else{
		    System.out.println("It is not Divisible by 4");
		}
	}
}
		    