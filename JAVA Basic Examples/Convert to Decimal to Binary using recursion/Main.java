import java.util.*;
 class Main
{
    static void decimal2binary(int n)
    {
        if(n > 0)
        {
            decimal2binary(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num == 0)
        {
            System.out.println("Binary of" + num+ " is : 0");
        }
        else 
        {
            System.out.println("Binary value of "+num+" is: ");
            decimal2binary(num);
        }
    }
}