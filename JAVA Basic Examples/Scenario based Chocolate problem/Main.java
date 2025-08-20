import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    System.out.print("Enter price: ");
		int price= sc.nextInt();
		System.out.print("Enter Money: ");
		int money =sc.nextInt();
		System.out.print("Enter wrap: ");
		int wrap= sc.nextInt();
		int t=0;
		int c= money/price;
		c=c+(c-1)/(wrap-1);
		System.out.print(c);
	}
}