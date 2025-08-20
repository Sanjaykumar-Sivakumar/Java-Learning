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
	    if(rev == num)
	    {
	        System.out.println("It is a palindrome");
	    }
	    else
	    {
	        System.out.println("It is not a palindrome");
	    }
	
	}
}
