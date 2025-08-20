import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of arrays
        System.out.print("Enter number of stations: ");
        int n = sc.nextInt();

        int[] gas = new int[n];
        int[] cost = new int[n];

        // Input gas values
        System.out.println("Enter gas at each station:");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        // Input cost values
        System.out.println("Enter cost to go to next station:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        // Logic to find the starting station
        int total = 0, current = 0, start = 0;

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            current += gas[i] - cost[i];

            if (current < 0) {
                current = 0;
                start = i + 1;
            }
        }

        if (total >= 0) {
            System.out.println("Start at station: " + start);
        } 
        else {
            System.out.println(-1);
        }
    }
}
