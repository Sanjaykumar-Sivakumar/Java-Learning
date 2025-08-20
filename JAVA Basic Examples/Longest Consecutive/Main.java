import java.util.*;
class Main 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> arr = new HashSet<>();
        Set<Integer> ar = new HashSet<>();
        int n = in.nextInt();
        int x=0;
        for(int i=0;i<n;i++)
        {
            int c=in.nextInt();
            arr.add(c);
        }
        System.out.println(arr);
        for (int num : arr) 
        {
            x=num;break;
        }
        int b=0;int d=0;
        for(int c :arr)
        {
            
            if(x==c)
            {
                d++;
                ar.add(c);
                ++x;
            }
        }
        System.out.println(ar); 
        System.out.println(d);
    }
}