public class Main {
    public static void printSubstrings(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
         
            for (int j = i + 1; j <= n; j++) {
               
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubstrings(s);
    }
}