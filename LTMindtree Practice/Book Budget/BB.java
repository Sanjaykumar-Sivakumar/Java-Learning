import java.util.*;
class BB{
    public static int minAmount(int N,int cost[],int earn[])
    {
        int TotalCost = 0;
        int TotalEarn = 0;
        for(int i = 0;i<N;i++)
        {
            TotalCost = TotalCost + cost[i];
            TotalEarn = TotalEarn + earn[i];
        }
        return Math.max(0, TotalCost - TotalEarn);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int cost[] = new int[N];
        System.out.print("Enter the Cost: ");
        for(int i = 0;i<N;i++)
        {
            cost[i] = sc.nextInt();
        }
        int earn[] = new int[N];
        System.out.print("Enter your Earnings: ");
        for(int i = 0;i<N;i++)
        {
            earn[i] = sc.nextInt();
        }
        int res = minAmount(N, cost, earn);
        System.out.println(res);
    }
}