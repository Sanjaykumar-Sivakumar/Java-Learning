
import java.util.Scanner;

public class Encrypt{
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result =  new StringBuffer();
        for(int i = 0;i<text.length();i++)
        {
            char c = text.charAt(i);
            if(Character.isUpperCase(c))
            {
                char ch = (char) (((c - 'A'+s)% 26) +'A');
                result.append(ch);
            }
            else if(Character.isLowerCase(c))
            {
                char ch = (char) (((c - 'a'+s)% 26) +'a');
                result.append(ch);
            }
            else 
            {
                result.append(c);
            }
        
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int s = sc.nextInt();

        StringBuffer encrypted = Encrypt.encrypt(text, s);
        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
    }
}