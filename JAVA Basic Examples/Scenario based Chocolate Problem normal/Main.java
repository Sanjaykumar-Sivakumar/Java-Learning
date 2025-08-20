import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Price: ");
        int money = sc.nextInt();
        System.out.print("Enter the Actual Price: ");
        int price = sc.nextInt();
        System.out.print("Enter the wraps per chocolate: ");
        int wrap = sc.nextInt();
        int chocolate = money / price;
        int Action1 = chocolate/wrap;
        int Action2 = Action1 / wrap;
        int Action3 = Action2 /wrap;
        System.out.print("Total no of chocolates = ");
        int result = chocolate + Action1 + Action2 + Action3;
        System.out.println(result);
    }
}