import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		int count = 0;
		for(int i = 2;i<=a;i++){
		    int f = 0;
		    for(int j = 1;j<=i;j++)
		    {
		        if(i%j==0)
		        {
		        f++;
		        }
		    }
		    if(f == 2)
		    {
		        count++;
		    }
		}
		System.out.println("Count of prime number upto " + a + " is : "+count);
	}
}