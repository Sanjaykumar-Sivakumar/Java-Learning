import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n1 = s1.length();
		int n2 = s2.length();
		int arr[][] = new int[n1 + 1][n2 + 1];
		for(int i = 0;i<=n1;i++)
		{
		    for(int j = 0;j<=n2;j++)
		    {
		        if(i == 0)
		        {
		            arr[i][j] = j;
		        }
		        else if(j == 0)
		        {
		            arr[i][j] = i;
		        }
		        else if(s1.charAt(i - 1) == s2.charAt(j - 1))
		        {
		            arr[i][j]=arr[i - 1][j - 1];
		        }
		        else{
		            arr[i][j]= 1 + Math.min(arr[i - 1][j - 1],Math.min(arr[i - 1][j],arr[i][j - 1]));
		        }
		    }
		}
		System.out.println(arr[n1][n2]);
	}
}