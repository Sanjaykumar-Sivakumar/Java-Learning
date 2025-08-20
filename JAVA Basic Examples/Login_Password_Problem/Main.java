/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Og_Password = "San@2004";
		int attempts = 0;
		while(attempts < 3)
		{
		    System.out.print("Enter the Login Password: ");
		    String Pass_input = sc.next();
		    if(Pass_input.equals(Og_Password))
		    {
		       System.out.println("Welcome!!");
		       break;
		    }
		    else{
		         System.out.println("Incorrect Password!!..Try again");
		         attempts++;
		         System.out.println("Attempt Number: "+attempts);
		    }
		    
		}
	}
}
