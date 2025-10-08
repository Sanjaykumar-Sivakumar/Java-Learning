import java.util.*;
class panagram{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> si = new HashSet<>();
        s= s.replaceAll("\\s", "").toLowerCase();
        for(char ch ='a';ch<='z';ch++)
        {
            si.add(ch);
        }
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            si.remove(ch);
        }
        if(si.isEmpty())
        {
            System.out.println("It is Panagram");
        }
        else{
            System.out.println("It is not a Panagram");
        }
    }
}