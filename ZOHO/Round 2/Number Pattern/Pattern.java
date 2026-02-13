import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int temp = i;
            
            for(int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp + (n - j);
            }
            
            System.out.println();
        }

    }
}
