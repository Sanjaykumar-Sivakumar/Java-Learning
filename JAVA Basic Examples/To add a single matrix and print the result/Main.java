import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size (rows and columns): ");
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();
        
        int arr[][] = new int[n1][n2];
        int sum = 0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
                sum+=arr[i][j];
            }
        }

        System.out.println("Given Matrix: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Addition Result: "+sum);

    }
}
