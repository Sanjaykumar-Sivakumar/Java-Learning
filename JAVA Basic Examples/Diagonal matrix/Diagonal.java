import java.util.*;
class Diagonal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int arr[][] = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++)
        {
            sum+= arr[i][i];
            sum+= arr[i][n - 1 - i];
        }
        if(n%2 == 1)
        {
            sum -= arr[n/2][n/2];
        }
        System.out.println(sum);

    }
}