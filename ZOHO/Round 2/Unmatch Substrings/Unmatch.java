import java.util.*;
class Unmatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder s11 = new StringBuilder();
        StringBuilder s12 = new StringBuilder();

        for(int i = 0;i<s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                s11.append(s1.charAt(i));
                s12.append(s2.charAt(i));
            }
            else{
                if(s11.length()>0)
                {
                    System.out.println(s11+" , "+s12);
                    s11.setLength(0);
                    s12.setLength(0);
                }
            }
        }
        if(s11.length()>0)
        {
            System.out.println(s11+" , "+s12);
        }
    }
}