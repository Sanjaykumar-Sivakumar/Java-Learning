import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner ob = new Scanner(System.in);
	    
	  String str = ob.nextLine();
	  String str1 = "";
	  for(int i=str.length()-1;i>=0;i--){
	      char ch = str.charAt(i);
	      if(Character.isLetter(ch)){
	          str1+=ch;
	      }
	  }
	  
	  String str2="";
	  int j=0;
	  for(int i=0;i<str.length();i++){
	      char ch = str.charAt(i);
	      if(Character.isLetter(ch)){
	          str2+=str1.charAt(j++);
	      }else{
	          str2+=ch;
	      }
	  }
	  
	  System.out.println(str2);
	  
	}
}