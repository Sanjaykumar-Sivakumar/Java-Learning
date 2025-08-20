import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Size: ");
		int n1 = sc.nextInt();
		int arr[][] = new int[n1][n1];
		System.out.print("Enter the array: ");
		for (int i =0;i<n1;i++)
		{
		    for(int j =0;j<n1;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		for (int i =0;i<n1;i++)
		{
		    for(int j =0;j<n1;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}