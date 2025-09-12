import java.util.*;
class SumEven{
    public static int SumEven(int n)
    {
        int sum = 0;
        for(int i = 2; i<n; i = i+2)
        {
            sum+= i ;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of Even Numbers: "+SumEven(n));
    }
}