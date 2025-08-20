import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	 Scanner ob = new Scanner(System.in);
	  System.out.print("Enter the String: "); 
	  String str = ob.nextLine();
	  String result="";
	  result+=str.charAt(0);
	  for(int i = 1;i<str.length();i++)
	  {
	      if(str.charAt(i) != str.charAt(i - 1))
	      {
	          result+=str.charAt(i);
	      }
	  }
	  System.out.println(result);
	  
	  
	}
}