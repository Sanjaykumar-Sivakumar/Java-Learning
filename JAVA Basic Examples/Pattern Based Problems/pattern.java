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
        // Hollow without space in 1st line Square Pattern
        for(int i = 0;i<=r;i++)
        {
            for(int j = 0;j<= r;j++)
            {
                if(i == 0 || j == 0 || i == r || j == r)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
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
        System.out.println("----------------------");
        // K - Pattern
        // Upper Half
         for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<= r - i + 1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //  Lower Half
        for(int i = 1;i<r;i++)
        {
            for(int j = 1;j<=i + 1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
         //Zero one triangle pattern
        for(int  i = 1;i<=r;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                if((i + j)%2==0)
                {
                    System.out.print(1+ " ");
                }
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
         //Number Changing Pyramid Pattern
         int num = 1;
        for(int  i = 1;i<=r;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
         System.out.println("----------------------");
         //Number Changing Pyramid Pattern
        for(int  i = 1;i<=r;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
         System.out.println("----------------------");
        //Left half Pyramid Pattern
        for(int  i = 1;i<=r;i++)
        {
            for(int j = 1;j<=r - i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}