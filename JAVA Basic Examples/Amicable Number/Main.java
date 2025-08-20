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
	    System.out.print("Enter the number1: ");
	    int num1 = sc.nextInt();
	    System.out.print("Enter the number2: ");
	    int num2 = sc.nextInt();
	    int sum1 = 0;
	    int sum2 = 0;
	    for(int i = 1;i<num1 ;i++)
	    {
	        if(num1%i==0)
	        {
	            sum1=sum1+i;
	        }
	    }
	    for (int j =1;j<num2;j++)
	    {
	        if(num2%j==0)
	        {
	        sum2+=j;
	        }
	    }
	    if(sum1 == num2 && sum2 == num1)
	    {
	        System.out.println("It is an Amicable Number");
	    }
	    else{
	        System.out.println("It is not an Amicable Number");
	    }
		
	}
}
