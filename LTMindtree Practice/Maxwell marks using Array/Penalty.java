import java.util.*;
class Penalty{
    static int PenaltySum(int arr[],int n)
    {
        int sum =0;
        Arrays.sort(arr);
        sum = sum + Math.abs(arr[0] - arr[1]);
        sum = sum + Math.abs(arr[n-1] - arr[n-2]);
        for(int i =1;i<n-1;i++)
        {
            sum += Math.min(Math.abs(arr[i] - arr[i+1]),Math.abs(arr[i] - arr[i-1]));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(""+ PenaltySum(arr, num));
    }
}