import java.util.*;
class Large{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[100];
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        //Brute Force n(log n)
        // Arrays.sort(arr);
        // for(int i = arr.length - 1;i>=0;i--)
        // {
        //     System.out.print(arr[i]);
        // }
        //O(n) - Optimized
        for(int num : arr)
        {
            count[num]++;
        }
        StringBuilder res = new StringBuilder();
        for(int i = count.length - 1;i>=0;i--)
        {
            while(count[i]>0)
            {
                res.append(i);
                count[i]--;
            }
        }
         System.out.println(res.toString());
    }
}