import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a ="";
		System.out.print("Enter the Number to convert as Binary: ");
		int decimal = sc.nextInt();
		    while(decimal!=0)
		    {
		        int remainder = decimal % 2;
		        a+= remainder;
		        decimal = decimal / 2;
		    }
		    System.out.print("Binary Result for given number: ");
		    for(int i = a.length() - 1;i>=0;i--)
		    {
		        System.out.print(a.charAt(i));
		    }
		}
	}
