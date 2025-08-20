import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Read number of rows and columns
    int r = sc.nextInt();
    int c = sc.nextInt();

    // Create and read the matrix
    int[][] mat = new int[r][c];
    for(int i = 0; i < r; i++) {
      for(int j = 0; j < c; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    // Initialize boundaries
    int top = 0;
    int bottom = r - 1;
    int left = 0;
    int right = c - 1;

    // Spiral printing
    while(top <= bottom && left <= right) {
      
      // Print top row
      for(int i = left; i <= right; i++)
        System.out.print(mat[top][i] + " ");
      top++;

      // Print right column
      for(int i = top; i <= bottom; i++)
        System.out.print(mat[i][right] + " ");
      right--;

      // Print bottom row (if still in bounds)
      if(top <= bottom) {
        for(int i = right; i >= left; i--)
          System.out.print(mat[bottom][i] + " ");
        bottom--;
      }

      // Print left column (if still in bounds)
      if(left <= right) {
        for(int i = bottom; i >= top; i--)
          System.out.print(mat[i][left] + " ");
        left++;
      }
    }
  }
}
