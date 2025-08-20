/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		int a = sc.nextInt();
		int sum = 0;
		for(int  i = 1 ;i<a ;i++)
		{
		    if(a % i == 0)
		    {
		        sum = sum + i;
		    }
		}
		if (sum == a)
		{
		    System.out.println("It is a perfect Number");
		}
		else
		{
		    System.out.println("It is not a perfect Number");
		}
	}
}
