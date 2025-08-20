import java.util.*;
 class Main
{
    static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        return 1;
        return fibonacci(n - 1)+ fibonacci(n - 2);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int c = sc.nextInt();
		for(int i = 0;i<c;i++)
		{
		    System.out.print(fibonacci(i)+" ");
		}
		
	}
}