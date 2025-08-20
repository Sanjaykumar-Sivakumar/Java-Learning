import java.util.*;
class Main {
public static void sortArr(int[] arr) 
{
		Arrays.sort(arr);
		System.out.print("Ascending order: ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void sortArr(String[] arr) {
		Arrays.sort(arr);
		System.out.print("Ascending order: ");
		for (String s : arr)
			System.out.print(s + " ");
		System.out.println();
	}

	public static void sortArr(Double[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.print("Descending Order: ");
		for (double i : arr)
			System.out.print((double)i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sortArr(arr);

		int m = sc.nextInt();
		sc.nextLine();
		String[] arr1 = new String[m];
		System.out.println("Enter the elements:");
		for (int i = 0; i < m; i++)
			arr1[i] = sc.nextLine();
		sortArr(arr1);

		int d = sc.nextInt();
		Double[] arr2 = new Double[d];
		System.out.println("Enter the elements:");
		for (int i = 0; i < d; i++)
			arr2[i] = sc.nextDouble();
		sortArr(arr2);
	}
}
