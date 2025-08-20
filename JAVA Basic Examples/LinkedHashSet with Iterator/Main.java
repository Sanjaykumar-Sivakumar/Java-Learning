import java.util.*;

class Main {
    public static void main(String[] args) {
    LinkedHashSet<Integer> s= new LinkedHashSet<Integer>();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i = 0;i<a;i++)
    {
        s.add(sc.nextInt());
    }
       // s.add(1);
        //s.add(2);
       // s.add(3);
        //s.add(4);
        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext()) {
            int sa = itr.next();
            System.out.print(sa+ " ");
        }
    }
}
