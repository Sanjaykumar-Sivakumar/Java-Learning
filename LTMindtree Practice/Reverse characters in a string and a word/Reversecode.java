import java.util.*;
class Reversecode{
    public static String ReverseFull(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    public static String ReverseEach(String s)
    {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words)
        {
            res.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return res.toString().trim();
    }
    public static String ReverseWord(String s)
    {
        String[] rev= s.split(" ");
        StringBuilder res = new StringBuilder();
        int len = rev.length;
        for(int i  = len - 1;i>=0;i--)
        {
            res.append(rev[i]).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Fully Reversed String: "+ReverseFull(str));
        System.out.println("After reversing each word in a string: "+ReverseEach(str));
        System.out.println("Reverse the words in a given string: "+ReverseWord(str));
    }
}