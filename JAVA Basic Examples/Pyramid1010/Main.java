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
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		for(int i =1 ; i<=a;i++)
		{
		    for(int j = 1;j<=i;j++)
		    {
		        if((i+j)%2==0)
		        {
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		      
		    }
		    System.out.println();
		}
	}
}
