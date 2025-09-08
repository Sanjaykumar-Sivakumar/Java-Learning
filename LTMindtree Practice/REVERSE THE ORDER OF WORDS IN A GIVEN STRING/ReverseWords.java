import java.util.*;
class ReverseWords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] rev = s.split(" ");
        int len = rev.length;
        for(int i = len - 1;i>=0;i--)
        {
            System.out.print(rev[i]+" ");
        }
    }
}