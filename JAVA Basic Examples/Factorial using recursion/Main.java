import java.util.*;
 class Main
{
    static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n*factorial(n - 1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: cursion");
		int c = sc.nextInt();
		if(c < 0)
		{
		   System.out.println("There is no factorial for negative numbers!!");
		}
		else{
		    int result = factorial(c);
		    System.out.println("Factorial of " + c+ " is: "+result);
		}
		
	}
}