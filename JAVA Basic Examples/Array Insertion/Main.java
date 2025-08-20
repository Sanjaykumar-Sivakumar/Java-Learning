import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position: ");
		int position = sc.nextInt();
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		int[] arr1 = new int[n + 1];
		for(int i = n ;i > position; i--)
		{
		    arr1[i] = arr[i - 1];
		}
		arr1[position]=value;
		for(int i =0;i<position;i++)
		{
		    arr1[i]=arr[i];
		}
		System.out.print("Array After Insertion: ");
		for(int j = 0;j < n + 1;j++)
		{
		    System.out.print(arr1[j]+ " ");
		}
	}
}
