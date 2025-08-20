import java.util.*;

class Main {
    void factor_count(int a) { 
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of factors of " + a + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        Main obj = new Main();
        obj.factor_count(a); 
    }
}
