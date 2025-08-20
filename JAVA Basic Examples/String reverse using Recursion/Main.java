import java.util.*;
class Main{
    static String Reverse(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        return Reverse(str.substring(1))+(str.charAt(0));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String og = sc.nextLine();
        System.out.println("Original:" + og);
        System.out.println("Reversed String: "+ Reverse(og));
    }
}