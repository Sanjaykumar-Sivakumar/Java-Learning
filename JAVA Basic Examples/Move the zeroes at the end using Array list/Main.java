import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Integer> name = new ArrayList<>();

        // Read numbers until -1 is entered
        do {
            n = sc.nextInt();
            name.add(n);
        } while (n != -1);

        // Remove the -1 from the list
        name.remove(name.size() - 1);

        // Move all 0s to the end using for loop
        int zeroCount = 0;
        
        // First, remove all 0s and count them
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i) == 0) {
                name.remove(i);
                zeroCount++;
                i--; // Stay at the same index after removal
            }
        }

        // Then, add zeroCount number of 0s at the end
        for (int i = 0; i < zeroCount; i++) {
            name.add(0);
        }

        // Print the final list
        System.out.println(name);
    }
}
