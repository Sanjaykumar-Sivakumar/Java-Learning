import java.util.*;
public class Main
{
    static void digit(int a)
    {
        int LastDigit = a % 10;
        int FirstDigit = a;
        while(FirstDigit >= 10)
        {
            FirstDigit = FirstDigit / 10;
        }
        System.out.println(FirstDigit + " "+ LastDigit);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		digit(a);
    }
}
