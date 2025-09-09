import java.util.*;
class Prime{
    public static boolean isPrime(int num)
    {
        if(num == 2) return true;
        for(int i = 2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i =2;i<=num;i++)
        {
            if(isPrime(i))
            {
            System.out.print(i+" ");
            }
        }
    }
}