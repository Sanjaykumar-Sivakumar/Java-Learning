import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		System.out.println("Enter the elements: ");
		for(int i = 0;i < n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
	    }
	    System.out.println("Diagonal Elements are: ");
	    for(int i = 0;i < n;i++)
        {
                System.out.println(mat[i][n - 1 - i]+ " ");
	    }
	}
	    
	
}
