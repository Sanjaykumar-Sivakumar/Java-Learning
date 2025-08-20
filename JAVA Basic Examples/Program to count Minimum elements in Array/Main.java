import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		int min_ind = 0;
		
		int arr[] = new int[n];
		System.out.print("Enter the Array Elements: ");
		for(int i = 0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max_ind = n - 1;
		int c = 0;
		while(min_ind < max_ind && arr[min_ind]  < arr[max_ind])
		{
		    c++;
		    min_ind++;
		}
		System.out.println(c);
	}
}
