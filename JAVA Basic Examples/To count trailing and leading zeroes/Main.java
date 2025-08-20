import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num =  sc.nextInt();
		Main obj1 = new Main();
		System.out.println(obj1.count_trailing(num));
		Main obj2 = new Main();
		obj2.count_leading(num);
	    System.out.println(obj2.count_leading(num));
		
	}
	static int count_trailing(int num)
	{
	    int count = 0;
	    while((num&1) == 0 && num!=0)
	    {
	        count++;
	        num = num>> 1;
	    }
	    return count;
	}
	static int count_leading(int num)
	{
	    int count = 0;
	    for(int i = 31;i>=0;i--)
	    {
	        if((num&(1 << i))==0)
	        {
	        count++;
	        }
	        else
	        {
	        break;
	        }
	    }
	    return count;
	}
}
		