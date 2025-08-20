import java.util.*;

class Main {
    public static void main(String[] args) {
    Set<Integer> s= new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter arr1 size: ");
    int a = sc.nextInt();
    System.out.print("Enter the elements: ");
    for(int i = 0;i<a;i++)
    {
        s.add(sc.nextInt());
    }
    System.out.print("Enter arr2 size: ");
    int b = sc.nextInt();
     System.out.print("Enter the elements: ");
    for(int i = 0;i<b;i++)
    {
        s.add(sc.nextInt());
    }
      for(int num : s)
      {
          System.out.print(num+ " ");
      }
    }
}
