import java.util.*;
class ProductID
{
    public static int getCount(int[] arr,int id)
    {
        int count = 0;
        for(int num : arr)
        {
            if(num == id)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int id = sc.nextInt();
        System.out.println(getCount(arr, id));
    }
}