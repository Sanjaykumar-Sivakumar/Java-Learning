
import java.util.*;

public class GridGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        
        while (true) {
            System.out.print("Enter N: ");
            String s = sc.nextLine();

            try {
                n = Integer.parseInt(s);
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Enter a positive number");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }

        int[][] arr = new int[n][n];
        Random r = new Random();

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = r.nextInt(10) * 2 + 2; // 2 to 20 even
                arr[i][j] = num;
            }
        }

        System.out.println("\nGrid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int x = 0;

        
        while (true) {
            System.out.print("\nSelect a number (2 to 20 even): ");
            String s2 = sc.nextLine();

            try {
                x = Integer.parseInt(s2);
                if (x >= 2 && x <= 20 && x % 2 == 0) {
                    break;
                } else {
                    System.out.println("Enter a valid even number");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }

       
        int cnt = 0;
        System.out.println("\nHighlighted Grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x) {
                    System.out.print("[ " + arr[i][j] + " ] ");
                    cnt++;
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nThe number " + x + " occurred " + cnt + " times.");

    }
}
