import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char cha = sc.next().charAt(0);
		if(a.contains(cha+""))
		{
		    System.out.println(cha + " is exist in " + a);
		}
		else{
		    System.out.println(cha + " is not exist in " + a);
		}
	}
}
