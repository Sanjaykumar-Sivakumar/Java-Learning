import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size (rows and columns): ");
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();
        
        int arr[][] = new int[n1][n2];
        int arr1[][] = new int[n1][n2];
        int sum[][] = new int[n1][n2];
        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
