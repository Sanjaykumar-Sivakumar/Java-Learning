import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        
        System.out.print("Enter the Letter you Want: ");
        char ch = sc.next().charAt(0);
        
        String[] words = input.split(" ");
        
        for (String word : words) {
            if (word.contains(String.valueOf(ch))) {
                System.out.println(word);
            }
        }
    }
}
