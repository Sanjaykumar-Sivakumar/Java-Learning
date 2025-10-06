
import java.util.*;

class Alternate{
    public static ArrayList<Integer> al(int[] arr)
    {
        int len = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;int j= len - 1;
        while(i < j)
        {
            res.add(arr[j]);
            res.add(arr[i]);
            j--;
            i++;
        }
        return res;
    }
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = al(arr);
        System.out.println(res);
        }
}