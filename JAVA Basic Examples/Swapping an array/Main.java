import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the 1st index: ");
    int fp = sc.nextInt();
    System.out.print("Enter the 2nd index: ");
    int sp = sc.nextInt();
    int temp=arr[fp];
    arr[fp]=arr[sp];
    arr[sp]=temp;
    System.out.print("Array elements after shuffling: ");
    for(int i =0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
        
    }
   
   
        
    }
}