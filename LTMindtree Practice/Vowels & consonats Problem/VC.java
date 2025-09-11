import java.util.*;
class VC
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String WithoutV = s.replaceAll("[aeiouAEIOU]", "");
        int vowelsCount = s.length() - WithoutV.length();
        int consonantCount = s.replaceAll("[^a-zA-Z]"," ").length() - vowelsCount;
        System.out.println("Vowel Count: "+vowelsCount);
        System.out.println("Consonant Count: "+consonantCount);
        System.out.println("String Without vowels: "+WithoutV);

    }
}