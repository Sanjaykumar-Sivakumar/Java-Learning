import java.util.*;
class Compression{
   public static String compress(String str)
   {
      String res="";
      int count = 1;
      for(int i = 0;i<str.length();i++)
      {
         if(i+1<str.length() && str.charAt(i) == str.charAt(i+1))
         {
            count++;
         }
         else{
            res = res + str.charAt(i) + count;
            count =1;
         }
      }
      return res;
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      System.out.println(compress(s));
   }
      
}