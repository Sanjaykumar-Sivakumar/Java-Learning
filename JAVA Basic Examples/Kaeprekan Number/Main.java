import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long square = (long) n * n;
        int numDigits = 0, temp = n;

        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }

        long pow10 = 1;
        for (int i = 0; i < numDigits; i++) {
            pow10 *= 10;
        }

        long right = square % pow10;
        long left = square / pow10;

        System.out.println("Square of " + n + " = " + square);
        System.out.println("Left part = " + left);
        System.out.println("Right part = " + right);

        if (left + right == n) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is NOT a Kaprekar number.");
        }
    }
}
