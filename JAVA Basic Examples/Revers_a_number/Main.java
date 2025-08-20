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
	    Scanner ff = new Scanner(System.in);
	    int num = ff.nextInt();
	    int rev=0;
	    int digit;
	    while(num !=0)
	    {
	        digit = num %10;
	        rev = rev * 10 + digit;
	        num/= 10;
	    }
	    System.out.println(rev);
	    
	
	}
}
