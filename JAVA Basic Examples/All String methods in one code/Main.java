import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "Java";

        System.out.println("Length of String: " + a.length());
        System.out.println("Check Character: " + a.charAt(0));
        System.out.println("Index is: " + a.indexOf('a'));
        System.out.println("Last Index is: " + a.lastIndexOf('a'));
        System.out.println("Upper Case is: " + a.toUpperCase());
        System.out.println("Lower Case is: " + a.toLowerCase());
        System.out.println("Check Empty: " + a.isEmpty());
        System.out.println("Substring is: " + a.substring(0, 3));
        System.out.println("Starts with 'He': " + a.startsWith("He"));
        System.out.println("Ends with 'va': " + a.endsWith("va"));
        System.out.println("Contains 'av': " + a.contains("av"));
        System.out.println("Equals 'Java': " + a.equals("Java"));
        System.out.println("Equals Ignore Case 'java': " + a.equalsIgnoreCase("java"));
        System.out.println("Compare to 'Java': " + a.compareTo("Java"));
        System.out.println("Replace 'a' with 'x': " + a.replace('a', 'x'));
        System.out.println("Replace All 'a' with 'o': " + a.replaceAll("a", "o"));
        System.out.println("Trim: [" + a.trim() + "]");
        System.out.println("Split: " + Arrays.toString(a.split(" ")));
        System.out.println("String Concatenation with 'Java': " + a.concat(b));
    }
}

