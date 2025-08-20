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
	  int sum =0;
	  
	  while(true)
	  {
	      System.out.print("Enter the prize: ");
	      double a = sc.nextDouble();
	      if (a == 0)
	      {
	          break;
	      }
	      System.out.print("Enter the quantity: ");
	      int b = sc.nextInt();
	      sum+= (a*b);
	  }
	  System.out.println("Total bill: " +sum);
	}
}
