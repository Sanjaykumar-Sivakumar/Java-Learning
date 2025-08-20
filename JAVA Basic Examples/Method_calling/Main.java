import java.util.*;
class Main
{
    static int Volume_Cube(int b)
    {
        return b*b*b;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//System.out.print("Enter the input: ");
		
		int cube = Volume_Cube(a);
		System.out.println(cube);
	}
}
		