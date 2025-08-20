import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nattu = sc.nextLine();
		for(int i = 0;i< nattu.length();i++)
		{
		    System.out.println(nattu.charAt(i) + " is: "+(int)nattu.charAt(i));
		}
	}
}
