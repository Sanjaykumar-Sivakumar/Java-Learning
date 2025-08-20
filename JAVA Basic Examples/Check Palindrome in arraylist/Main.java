import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		ArrayList <Integer> num = new ArrayList<>();
		for(int i = 0;i<n;i++)
		{
		    num.add(sc.nextInt());
		}
		ArrayList <Integer> rev = new ArrayList<>(num);
		Collections.reverse(rev);
		if(rev.equals(num))
		{
		    System.out.println("It is Palindrome!");
		}
		else
		{
		    System.out.println("It is not Palindrome!");
		}
	}
}