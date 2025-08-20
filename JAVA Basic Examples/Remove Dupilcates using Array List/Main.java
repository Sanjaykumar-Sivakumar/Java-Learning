import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        System.out.println("After removing Duplicates:");
        for (int res : numbers) {
            System.out.print(res + " ");
        }
    }
}
