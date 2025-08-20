import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nattu = sc.nextLine();
	    String letter ="";
	    String Numbers ="";
	    for(int i = 0;i<nattu.length();i++)
	    {
	        char sa = nattu.charAt(i);
	        if(Character.isDigit(sa))
	        {
	            Numbers+= sa;
	        }
	        else {
	            letter+= sa;
	        }
	    }
	    System.out.println(Numbers);
	    System.out.println(letter);
	    
	}
}
