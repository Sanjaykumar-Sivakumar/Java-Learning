import java.util.*;
public class Server
{
    public static int getUsage(int[] usages,int k,int M)
    {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int use: usages)
        {
            pq.offer(use);
        }
        for(int i = 0; i<M;i++)
        {
            int minuse = pq.poll();
            pq.offer(minuse + 1);
        }
        List<Integer> lis = new ArrayList<>(pq);
        Collections.sort(lis);
        return lis.get(k - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] usages =  new int[N];
        for(int i =0 ;i<N;i++)
        {
            usages[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int M = sc.nextInt();
        int res = getUsage(usages, K, M);
        System.out.println("Maximum Possible K-th smallest usage: "+res);
        }
}