import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the input:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i = 0;i<a;i++)
		{
		    arr[i] = sc.nextInt();
		    //System.out.print(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println(arr[a - 2]);
		
	}
}
