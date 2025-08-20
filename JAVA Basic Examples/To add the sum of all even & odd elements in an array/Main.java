import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int arr[][] = new int[n][n];
        
        
        for(int i = 0;i<n;i++)
        {
          for(int j = 0;j<n;j++)
          {
              arr[i][j] = sc.nextInt();
               if (arr[i][j]%2 == 0) 
               { 
                even+= arr[i][j] ;
            } 
            else {
                odd += arr[i][j];
            }
              
          }
        }
        
        System.out.println("Sum of Even Numbers: " + even);
        System.out.println("Sum of Odd Numbers: " + odd);
    }
}
