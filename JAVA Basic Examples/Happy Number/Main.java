import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum, digit;

        int count = 0; // to avoid infinite loop

        while (n != 1 && count < 100) {
            sum = 0;

            // Get each digit and add its square to sum
            while (n > 0) {
                digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
                
            }
System.out.println(sum);
            n = sum;
            count++;
        }

        if (n == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}