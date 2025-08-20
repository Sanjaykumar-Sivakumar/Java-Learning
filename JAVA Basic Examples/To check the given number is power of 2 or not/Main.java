import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
        if((num & (num - 1)) ==0) 
        {
            System.out.println(num + " is power of 2");
        }
        else
        {
        System.out.println(num + " is not a power of 2");
        }
	}
}