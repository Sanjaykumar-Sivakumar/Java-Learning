import java.util.*;
class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // Number Increasing Pattern
         for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        // Number Increasing Reverse Pattern
        for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= r - i + 1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        // Number Repetiton Pattern
         for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        // Number Reptition Reverse Pattern
        for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= r - i + 1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
         System.out.println("----------------------");
        // Square Pattern
         for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= r;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        // Hollow Square Pattern
        for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= r;j++)
            {
                if(i == 1 || j == 1 || i == r || j == r)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
        // Right Triangle Pattern
         for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        // Reverse Right Triangle Pattern
        for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= r - i + 1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}