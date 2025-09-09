import java.util.*;
class Fibbanocci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            System.out.print(fib(i));
        }
    }
    public static int fib(int num)
    {
        if(num<=2) return 1;
        return fib(num-1)+ fib(num-2);
    }
}