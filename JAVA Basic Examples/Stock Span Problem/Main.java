import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] price = new int[n];
        int[] span = new int[n];

        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            span[i] = 1;
            for (int j = i - 1; j >= 0 && price[j] <= price[i]; j--) {
                span[i]++;
            }
            
            
        }

        System.out.println("Stock Span:");
        System.out.print(Arrays.toString(span));

    }
}