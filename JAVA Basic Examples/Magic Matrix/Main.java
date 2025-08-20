import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[][] arr = new int[a][a];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int j = 0; j < a; j++) {
            sum += arr[0][j]; 
        }

     
        for (int i = 0; i < a; i++) {
            int rowsum = 0;
            for (int j = 0; j < a; j++) {
                rowsum += arr[i][j];
            }
            if (rowsum != sum) {
                System.out.println("It is not a magic matrix");
                return;
            }
        }


        for (int j = 0; j < a; j++) {
            int colsum = 0;
            for (int i = 0; i < a; i++) {
                colsum += arr[i][j];
            }
            if (colsum != sum) {
                System.out.println("It is not a magic matrix");
                return;
            }
        }


        int diagonal1 = 0, diagonal2 = 0;
        for (int i = 0; i < a; i++) {
            diagonal1 += arr[i][i];
            diagonal2 += arr[i][a - 1 - i];
        }

        if (diagonal1 == sum && diagonal2 == sum) {
            System.out.println("It is a Magic matrix!!");
        } else {
            System.out.println("It is not a Magic matrix!!");
        }
    }
}
