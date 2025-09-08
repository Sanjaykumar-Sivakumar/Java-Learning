
import java.util.Scanner;

class Vowels
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1  = sc.nextLine();
        String res = "";
        res = s1.replaceAll("[AEIOUaeiou]", " ");
        System.out.print(res);
    }
}