import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Take input
        permute(str, ""); // Start with empty result
    }

    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result); // Print when done
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Current character
            char ch = str.charAt(i);

            // Remaining string without the chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            permute(remaining, result + ch);
        }
    }
}
