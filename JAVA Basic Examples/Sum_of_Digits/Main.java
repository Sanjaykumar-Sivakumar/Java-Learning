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
		Scanner dd = new Scanner(System.in);
		System.out.print("Enter the input: ");
		int a = dd.nextInt();
		int sum = 0;
		while( a != 0 )
		{
		    sum+=a%10;
		    a/=10;
		}
		System.out.println("Sum of digits: " +sum);
	}
}
