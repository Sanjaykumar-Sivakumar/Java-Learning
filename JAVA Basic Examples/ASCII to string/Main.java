import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nattu = sc.nextLine();
		int arr[] = new int[nattu.length()];
		for(int i = 0;i< nattu.length();i++)
		{
		    arr[i] = (int)nattu.charAt(i);
		    System.out.println(arr[i]);
		}
		for(int i = 0;i< nattu.length();i++)
		{
		    System.out.println((char)arr[i]);
		}
	}
}
