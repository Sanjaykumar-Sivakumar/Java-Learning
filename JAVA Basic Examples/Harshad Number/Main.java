import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp =n;
        int sum =0;
        while(temp > 0)
        {
            int digit = temp % 10;
            sum+= digit;
            temp = temp/ 10;
        }
        if(temp == 0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
        
    }
}
        
        