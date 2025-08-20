import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
        int onshift = 0;
        int offshift = 0;
        String binary = Integer.toBinaryString(num);
        for(char c :binary.toCharArray())
        {
            if(c == '1')
            {
                onshift++;
            }
            else if(c == '0')
            {
                offshift++;
            }
        }
        System.out.println("Binary representation: " + binary);
        System.out.println("No of 1's:" + onshift);
        System.out.println("No of 0's: "+offshift);
		    
		}
	}
