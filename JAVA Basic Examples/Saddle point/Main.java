import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] mat = new int[r][c];

    // Input
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    boolean found = false;

    // Saddle point logic
    for (int i = 0; i < r; i++) {
      int min = mat[i][0];
      int colIndex = 0;

      // Find min in the row
      for (int j = 1; j < c; j++) {
        if (mat[i][j] < min) {
          min = mat[i][j];
          colIndex = j;
        }
      }

      // Check if min is max in its column
      boolean isSaddle = true;
      for (int k = 0; k < r; k++) {
        if (mat[k][colIndex] > min) {
          isSaddle = false;
          break;
        }
      }

      if (isSaddle) {
        System.out.println("Saddle point is: " + min);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("No saddle point found.");
    }
  }
}
