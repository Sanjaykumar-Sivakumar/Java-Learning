import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        // Fill the table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0) {
                    dp[i][j] = j; // insert all
                }
                else if (j == 0) {
                    dp[i][j] = i; // remove all
                }
                else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]; // no change
                }
                else {
                    dp[i][j] = 1 + Math.min(
                    dp[i-1][j-1],Math.min(dp[i-1][j], // remove
                                 dp[i][j-1])); // insert
                    
                }
            }
        }

        System.out.println(dp[m][n]);
    }
}
