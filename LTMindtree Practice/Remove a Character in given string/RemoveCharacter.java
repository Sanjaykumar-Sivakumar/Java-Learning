import java.util.*;
public class RemoveCharacter{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.next();
        s1 = s1.replace(s2,""); //or (s1 = s1.replaceAll(s2,""))
        System.out.print(s1);
    }
}