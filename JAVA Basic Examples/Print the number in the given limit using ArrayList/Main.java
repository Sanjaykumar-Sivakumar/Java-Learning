import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		ArrayList <Integer> num = new ArrayList<>();
		for(int i  = 0;i<a;i++)
		{
		    arr[i] = sc.nextInt();
		    num.add(arr[i]);
		}
		
		System.out.print(num);
	}
}