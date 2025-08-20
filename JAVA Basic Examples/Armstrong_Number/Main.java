import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = ob.nextInt();
		int digits=0;
		int n = num;
		
		while(n!=0){
		    n/=10;
		    digits++;
		}
		
		n=num;
		int sum = 0;
		while(n!=0){
		    int r = n%10;
		    sum+=Math.pow(r,digits);
		    n/=10;
		}
		
		if(sum == num){
		    System.out.println("This is a Armstrong Number..!");
		}else{
		    System.out.println("This is not a Armstrong Number..!");
		}
	}
}