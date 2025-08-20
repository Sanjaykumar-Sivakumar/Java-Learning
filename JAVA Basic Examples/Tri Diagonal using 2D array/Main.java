import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		System.out.println("Enter the rows & columns: ");
		for(int i = 0;i<a;i++)
		{
		  for(int j = 0;j<b;j++)
		  {
		      arr[i][j]=sc.nextInt();
		  }
		}
		System.out.println("Given matrix: ");
		for(int i = 0;i<a;i++)
		{
		  for(int j = 0;j<b;j++)
		  {
		      System.out.print(arr[i][j]+ " ");
		  }
		  System.out.println();
		}
		System.out.println("Output: ");
		for(int i = 0;i<a;i++)
		{
		  for(int j = 0;j<b;j++)
		  {
		  if(j == i || j == i - 1 || j == i + 1)
		  {
		    System.out.print(arr[i][j]+ " ");
		  }
		  else
		  {
		       System.out.print("* ");
		  }
		  }
		  System.out.println();
		}
	}
}