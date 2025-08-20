import java.util.*;
class Solution{
    public void diagonal(int[][] mat,int n)
    {
        int PrimarySum = 0;
        int SecondarySum = 0;
        for(int i = 0;i < n;i++)
        {
            PrimarySum+=mat[i][i];
            SecondarySum+=mat[i][n - 1 - i];
        }
        System.out.println(Math.abs(PrimarySum - SecondarySum));
    }
}
class Main
{   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		for(int i = 0;i < n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
    
        }
        Solution obj = new Solution();
        obj.diagonal(mat, n);
	}
}
