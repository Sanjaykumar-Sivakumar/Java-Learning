import java.util.*;
class Solution
{
    static int p4(int n,int m,int mat[][])
    {
        int ans = 0;
        for(int i = 0;i<n;++i)
        {
            for(int j = 0;j<m;++j)
            {
                if(mat[i][j]%2==0)
                {
                    ans++;
                }
            }
        }
        return ans;
        }
    }
    class Main{
	public static void main(String  []args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of n matrix: ");
	    int n = sc.nextInt();
	    System.out.print("Enter the size of m matrix: ");
	    int m = sc.nextInt();
	    int[][] mat = new int[n][m];
	    System.out.print("Enter the n matrix and m matrix: ");
	    for(int i = 0;i<n;i++)
	    {
	        for(int j = 0;j<m;j++)
	        {
	            mat[i][j]=sc.nextInt();
	        }
	    }
	    Solution obj = new Solution();
	    int ans =obj.p4(n,m,mat);
	    System.out.println("No of Even Numbers in the array: " + ans);
		
	}
    
}
