import java.util.*;
public class Main{
    

public static void main (String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array: ");
    int a = sc.nextInt();
    int arr[] = new int[a];
    int arr1[] = new int[a];
    for (int i = 0;i<a;i++)
    {
        arr[i] = sc.nextInt();
    }
    for(int i =0 ;i<a ;i++)
    {
        if(i == 0)
        {
            arr1[i] = arr[i + 1];
        }
        else if(i == a - 1)
        {
            arr1[i] = arr[i - 1];
        }
        else
        {
            arr1[i] = arr[i - 1]*arr[i + 1];
        }
        System.out.println(" " +arr1[i]);
    }
}
   }