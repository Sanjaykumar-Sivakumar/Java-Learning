import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n1 = sc.nextInt();
        ArrayList<Integer> num1 = new ArrayList<>();
        for(int i = 0;i<n1;i++)
        {
     
            num1.add(sc.nextInt());
        }
        ArrayList<Integer> num2 = new ArrayList<>();
        for(int i = 0;i<n1;i++)
        {
            num2.add(sc.nextInt());
        }
        num1.addAll(num2);
        System.out.println(num1);
        
    }
}